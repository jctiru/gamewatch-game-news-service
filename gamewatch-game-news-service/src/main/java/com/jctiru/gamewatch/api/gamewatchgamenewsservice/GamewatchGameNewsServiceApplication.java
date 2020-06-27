package com.jctiru.gamewatch.api.gamewatchgamenewsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GamewatchGameNewsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamewatchGameNewsServiceApplication.class, args);
	}

}
