package com.microservices.deno.limitservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class ConfigurationController {

	private Logger logger = LoggerFactory.getLogger("mainclass");
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguraion getLimit() {
		logger.info("===============");
		return new LimitConfiguraion(configuration.getMaximum(), configuration.getMinimum());
	}
}
