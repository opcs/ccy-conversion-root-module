package com.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.controller.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from, String to);
}
