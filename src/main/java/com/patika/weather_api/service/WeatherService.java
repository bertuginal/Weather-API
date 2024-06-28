package com.patika.weather_api.service;

import com.patika.weather_api.dto.request.WeatherRequest;
import com.patika.weather_api.dto.response.GeocodeResponse;
import com.patika.weather_api.dto.response.WeatherResponse;
import com.patika.weather_api.exceptions.WeatherException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    public String weatherApiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public WeatherResponse weatherCondition(WeatherRequest request, String exclude) {

        //open weather tarafından verilen api key, geo code url ve kullanıcıdan istenen ülke kodu ile şehir ismi
        String geocodeUrl = String.format("https://api.openweathermap.org/geo/1.0/direct?q=%s,%s&appid=%s", request.getCountryCode(), request.getCityName(), weatherApiKey);

        GeocodeResponse[] geocodeResponses = restTemplate.getForObject(geocodeUrl, GeocodeResponse[].class);

        if (geocodeResponses.length == 0 || geocodeResponses == null) {
            throw new WeatherException("Geographic code information could not be obtained!", HttpStatus.BAD_REQUEST);
        }

        //kullanıcıdan istenen ülke ve şehir bilgisine göre enlem ve boylam koordinatları
        Double latitude = geocodeResponses[0].getLatitude();
        Double longitude = geocodeResponses[0].getLongitude();

        //open weather tarafından verilen api key, weather url ve kullanıcıdan istenen ülke kodu ile şehir bilgisine göre enlem ve boylam koordinatları
        //"exclude" parametresi istenmeyen veri setlerini hariç tutmak için kullanılır.
        String weatherUrl = String.format("https://api.openweathermap.org/data/2.5/onecall?lat=%s&lon=%s&exclude=%s&appid=%s", latitude, longitude, exclude, weatherApiKey);

        return restTemplate.getForObject(weatherUrl, WeatherResponse.class);
    }


}
