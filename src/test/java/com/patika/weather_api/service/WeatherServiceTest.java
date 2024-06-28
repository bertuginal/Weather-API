package com.patika.weather_api.service;

import com.patika.weather_api.dto.request.WeatherRequest;
import com.patika.weather_api.dto.response.GeocodeResponse;
import com.patika.weather_api.dto.response.WeatherResponse;
import com.patika.weather_api.exceptions.WeatherException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class WeatherServiceTest {

    @InjectMocks
    private WeatherService weatherService;

    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        //weatherService.weatherApiKey = "dummyApiKey"; // Set a dummy API key for testing
    }

    @Test
    void testWeatherConditionSuccess() {
        // given
        WeatherRequest request = new WeatherRequest();
        request.setCityName("London");
        request.setCountryCode("GB");

        GeocodeResponse[] geocodeResponses = { new GeocodeResponse() };
        WeatherResponse mockWeatherResponse = new WeatherResponse();

        // when
        when(restTemplate.getForObject(anyString(), eq(GeocodeResponse[].class))).thenReturn(geocodeResponses);
        when(restTemplate.getForObject(anyString(), eq(WeatherResponse.class))).thenReturn(mockWeatherResponse);

        // then
        WeatherResponse response = weatherService.weatherCondition(request, "minutely,hourly");
        assertNotNull(response);
        verify(restTemplate, times(1)).getForObject(anyString(), eq(GeocodeResponse[].class));
        verify(restTemplate, times(1)).getForObject(anyString(), eq(WeatherResponse.class));
    }

    @Test
    void testWeatherConditionGeocodeResponseIsEmpty() {
        // given
        WeatherRequest request = new WeatherRequest();
        request.setCityName("InvalidCity");
        request.setCountryCode("GB");

        GeocodeResponse[] geocodeResponses = {};

        // when
        when(restTemplate.getForObject(anyString(), eq(GeocodeResponse[].class))).thenReturn(geocodeResponses);

        // then
        WeatherException exception = assertThrows(WeatherException.class, () -> {
            weatherService.weatherCondition(request, "minutely,hourly");
        });

        assertEquals(HttpStatus.BAD_REQUEST, exception.getHttpStatus());
        assertEquals("Geographic code information could not be obtained!", exception.getMessage());
    }

    @Test
    void testWeatherConditionGeocodeResponseIsNull() {
        // given
        WeatherRequest request = new WeatherRequest();
        request.setCityName("InvalidCity");
        request.setCountryCode("GB");

        // when
        when(restTemplate.getForObject(anyString(), eq(GeocodeResponse[].class))).thenReturn(null);

        // then
        WeatherException exception = assertThrows(WeatherException.class, () -> {
            weatherService.weatherCondition(request, "minutely,hourly");
        });

        assertEquals(HttpStatus.BAD_REQUEST, exception.getHttpStatus());
        assertEquals("Geographic code information could not be obtained!", exception.getMessage());
    }
}
