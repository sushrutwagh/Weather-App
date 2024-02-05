package com.deloitte.fi.forecast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.deloitte.fi.forecast.model.Weather;
import com.deloitte.fi.forecast.service.WeatherForecastService;

@RestController
@RequestMapping("/forecast")
public class WeatherForeCastController {	
	@Autowired
	WeatherForecastService forecastService;
	
	@GetMapping(value = "/{city}/{fromdate}/{todate}")
	public Iterable<Weather> getWeatherByDateRange(@PathVariable String city,@PathVariable String fromdate,
			@PathVariable String todate) {
			return forecastService.getWeatherByDateRange(city, fromdate, todate);

	}
	
}
