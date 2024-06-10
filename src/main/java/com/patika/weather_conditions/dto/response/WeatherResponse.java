package com.patika.weather_conditions.dto.response;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {
    private String forecast;
    private Double temperature;
    private String description;
}
