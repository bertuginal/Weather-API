package com.patika.weather_api.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {

    //hava tahmini, derece ve açıklama alanları
    private String forecast;
    private Double temperature;
    private String description;

}
