package com.example.demo.systemInit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class CommandLineRunnerInitTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("》》》》》》》》》》系统初始化-开始-2《《《《《《《《《《");
		
	}

}
