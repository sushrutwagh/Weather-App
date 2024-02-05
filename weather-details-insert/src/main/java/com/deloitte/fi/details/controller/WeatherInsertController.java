package com.deloitte.fi.details.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.fi.details.model.Weather;
import com.deloitte.fi.details.service.WeatherInsertService;

@RestController
@RequestMapping("/insert")
public class WeatherInsertController {

	@Autowired
	WeatherInsertService insertService;

	@PostMapping("/weatherdetails")
	public Weather insertDetails(@RequestBody Weather weather) {
			return insertService.insertDetails(weather);	
	}
	
}
