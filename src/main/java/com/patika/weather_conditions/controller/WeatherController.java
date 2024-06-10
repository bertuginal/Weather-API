package com.patika.weather_conditions.controller;

import com.patika.weather_conditions.dto.request.WeatherRequest;
import com.patika.weather_conditions.dto.response.WeatherResponse;
import com.patika.weather_conditions.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    private final WeatherService weatherService;


    @PostMapping
    public ResponseEntity<WeatherResponse> getWeather(@RequestBody WeatherRequest request, @RequestParam(required = false,defaultValue = "") String exclude){
        WeatherResponse response= weatherService.getWeather(request,exclude);

        return new  ResponseEntity<>(response,HttpStatus.OK);
    }
}
