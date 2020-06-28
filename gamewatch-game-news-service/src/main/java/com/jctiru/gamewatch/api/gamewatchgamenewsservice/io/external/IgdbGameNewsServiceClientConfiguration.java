package com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

import com.jctiru.gamewatch.api.gamewatchgamenewsservice.AppPropertiesFile;

import feign.Logger;
import feign.RequestInterceptor;

@Configuration
public class IgdbGameNewsServiceClientConfiguration {

	@Bean
	public RequestInterceptor requestInterceptor(AppPropertiesFile appPropertiesFile) {

		return requestTemplate -> {
			requestTemplate.header("Accept", MediaType.APPLICATION_JSON_VALUE);
			requestTemplate.header("user-key", appPropertiesFile.getIgdbApiKey());
		};
	}

	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

}
