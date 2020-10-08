package com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

import com.jctiru.gamewatch.api.gamewatchgamenewsservice.AppPropertiesFile;

import feign.Logger;
import feign.RequestInterceptor;

@Configuration
public class GameSpotArticlesServiceClientConfiguration {

	@Bean
	public RequestInterceptor requestInterceptor(AppPropertiesFile appPropertiesFile) {

		return requestTemplate -> {
			requestTemplate.header("Accept", MediaType.APPLICATION_JSON_VALUE);
			requestTemplate.header("User-Agent", "api.gamewatch.jctiru.com");
			requestTemplate.query("api_key", appPropertiesFile.getGameSpotApiKey());
			requestTemplate.query("format", "json");
		};
	}

	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

}
