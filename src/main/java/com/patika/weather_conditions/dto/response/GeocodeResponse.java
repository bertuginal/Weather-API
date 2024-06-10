package com.patika.weather_conditions.dto.response;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeocodeResponse {
    private Double lat;
    private Double lon;
}
