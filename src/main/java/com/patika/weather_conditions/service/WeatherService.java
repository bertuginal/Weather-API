package com.patika.weather_conditions.service;


import com.patika.weather_conditions.dto.request.WeatherRequest;
import com.patika.weather_conditions.dto.response.GeocodeResponse;
import com.patika.weather_conditions.dto.response.WeatherResponse;
import com.patika.weather_conditions.exceptions.WeatherException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate=new RestTemplate();

    public WeatherResponse getWeather(WeatherRequest request,String exclude){

        String geoUrl=String.format("http://api.openweathermap.org/geo/1.0/direct?q=%s,%s&limit=1&appid=%s",request.getCity(),request.getCountryCode(),apiKey);

        GeocodeResponse[] geocodeResponses=restTemplate.getForObject(geoUrl,GeocodeResponse[].class);

        if(geocodeResponses==null || geocodeResponses.length==0)
            throw new WeatherException("Unable to get geocode information", HttpStatus.BAD_REQUEST);


        //Verilen şehir ve ülke bilgisine göre koordinatlar alınıyor.
        double lat=geocodeResponses[0].getLat();
        double lon=geocodeResponses[0].getLon();

        String weatherUrl=String.format("https://api.openweathermap.org/data/2.5/onecall?lat=%s&lon=%s&exclude=%s&appid=%s&units=metric",lat
        ,lon,exclude,apiKey);

        return restTemplate.getForObject(weatherUrl,WeatherResponse.class);
    }
}
