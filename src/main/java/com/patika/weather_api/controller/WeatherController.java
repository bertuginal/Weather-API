package com.patika.weather_api.controller;

import com.patika.weather_api.dto.request.WeatherRequest;
import com.patika.weather_api.dto.response.WeatherResponse;
import com.patika.weather_api.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/weathers")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @PostMapping
    public ResponseEntity<WeatherResponse> weatherCondition(@RequestBody WeatherRequest request,
                                                            @RequestParam(required = false, defaultValue = "") String exclude){
        WeatherResponse response = weatherService.weatherCondition(request, exclude);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
