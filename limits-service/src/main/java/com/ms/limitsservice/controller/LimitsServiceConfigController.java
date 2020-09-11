package com.ms.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.limitsservice.config.LimitPropConfig;
import com.ms.limitsservice.domain.Limits;

@RestController
public class LimitsServiceConfigController {
	
	@Autowired
	LimitPropConfig prop;

	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(prop.getMinimum(),prop.getMaximum());
	}
}
