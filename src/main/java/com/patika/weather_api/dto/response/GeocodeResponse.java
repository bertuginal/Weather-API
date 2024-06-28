package com.patika.weather_api.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeocodeResponse {

    //istenen ülke ve şehir bilgisine göre enlem ve boylam koordinatları
    private Double latitude;
    private Double longitude;
}
