package com.example.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limits.bean.LimitsConfigurations;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
private	LimitsConfigurations limits;

	@GetMapping("/limits")
	public LimitsConfigurations returnLimits() {
		return new LimitsConfigurations(limits.getMaximum(),limits.getMinimum());
	}
}
