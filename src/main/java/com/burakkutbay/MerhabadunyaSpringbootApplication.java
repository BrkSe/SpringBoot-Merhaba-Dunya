package com.burakkutbay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MerhabadunyaSpringbootApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MerhabadunyaSpringbootApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MerhabadunyaSpringbootApplication.class, args);
	}
}