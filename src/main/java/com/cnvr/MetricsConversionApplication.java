package com.cnvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cnvr"})
public class MetricsConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetricsConversionApplication.class, args);
	}

}
