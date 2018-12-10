package com.example.demo.systemInit;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Command;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class ApplicationRunnerInitTest implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
			
		System.out.println("》》》》》》》》》》系统初始化-开始-1《《《《《《《《《《");
			
	}

}
