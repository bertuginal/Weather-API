package com.patika.weather_api.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WeatherRequest {

    //kullanıcıdan girilen ülke kodu ve şehir ismi alanları
    @NotEmpty(message = "Country code cannot be empty!")
    private String countryCode;

    @NotEmpty(message = "City name cannot be empty!")
    private String cityName;
}
