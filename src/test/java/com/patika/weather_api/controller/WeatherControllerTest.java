package com.patika.weather_api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.patika.weather_api.dto.request.WeatherRequest;
import com.patika.weather_api.dto.response.WeatherResponse;
import com.patika.weather_api.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WeatherController.class)
class WeatherControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WeatherService weatherService;

    @Test
    void response_successfully() throws Exception {

        //given
        ObjectMapper objectMapper = new ObjectMapper();
        String body = objectMapper.writeValueAsString(prepareWeatherRequest());

        // Mock service response
        WeatherResponse mockResponse = new WeatherResponse();
        when(weatherService.weatherCondition(any(WeatherRequest.class), any(String.class)))
                .thenReturn(mockResponse);

        // when
        ResultActions resultActions = mockMvc.perform(post("/api/v1/weathers")
                .content(body)
                .contentType(MediaType.APPLICATION_JSON));

        //then - assertion
        resultActions.andExpect(status().isOk());
        verify(weatherService, times(1)).weatherCondition(Mockito.any(WeatherRequest.class), any(String.class));
    }

    private WeatherRequest prepareWeatherRequest() {
        WeatherRequest request = new WeatherRequest();
        request.setCityName("London");
        request.setCountryCode("ISO 3166-2:US");
        return request;
    }

}