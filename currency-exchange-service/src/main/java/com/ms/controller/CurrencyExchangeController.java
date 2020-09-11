package com.ms.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Environment enviroment;
	@Autowired
	ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		int port = Integer.parseInt(enviroment.getProperty("local.server.port"));
		
		//ExchangeValue ev= new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
		
		ExchangeValue ev = repository.findByFromAndTo(from, to);
		ev.setPort(port);
		
		logger.info("{}", ev);
		return ev;
	}
}
