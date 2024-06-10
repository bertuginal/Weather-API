package com.patika.weather_conditions.dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherRequest {


    @NotBlank(message = "Country code cannot be blank")
    private String countryCode;

    @NotBlank(message = "City cannot be blank")
    private String city;
}
