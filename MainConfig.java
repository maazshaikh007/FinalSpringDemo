package com.maaz.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.maaz.spring")
public class MainConfig {

	@Bean
	public Employee hdfcEmployee()
	{
		return new HdfcEmployee(hdfcROI());
		
	}
	
	@Bean
	public RateOfInterest hdfcROI()
	{
		return new HdfcRoi();
	}
	
	
}
