package com.deloitte.fi.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.fi.weather.model.Weather;
import com.deloitte.fi.weather.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {	
	@Autowired
	WeatherService weatherService;
	
	@GetMapping("/getall")
	public Iterable<Weather> getAllWeatherDetails() {
			return weatherService.getAllWeatherDetails();
	}
		
		@GetMapping("/citydate/{city}/{date}")
		public Iterable<Weather> getWeatherByCityAndDate(@PathVariable String city, @PathVariable String date) {
				Iterable<Weather> weather = weatherService.getWeatherByCityAndDate(city, date);
				return weather;
		}
		
		// @PostMapping("/insertMultipleDetails")
		// public Iterable<Weather> insertMultipleDetails(@RequestBody Iterable<Weather> weather) {
		// 		return weatherService.insertMultipleDetails(weather);
		// }
	
}
