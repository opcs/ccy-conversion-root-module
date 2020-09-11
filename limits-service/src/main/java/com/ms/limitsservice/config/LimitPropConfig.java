package com.ms.limitsservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@ConfigurationProperties("limits-service")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LimitPropConfig {
	private int minimum;
	private int maximum;

}
