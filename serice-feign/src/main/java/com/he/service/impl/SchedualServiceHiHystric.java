package com.he.service.impl;

import org.springframework.stereotype.Component;

import com.he.service.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	/**
	 * 熔断处理
	 */
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry " + name;
	}
}