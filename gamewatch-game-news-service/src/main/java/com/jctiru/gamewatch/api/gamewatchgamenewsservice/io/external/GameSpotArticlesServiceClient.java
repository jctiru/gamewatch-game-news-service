package com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.response.GameSpotArticlesResponseModel;

@FeignClient(name = "gamespot-articles-service", url = "https://www.gamespot.com/api/articles")
public interface GameSpotArticlesServiceClient {

	@GetMapping
	public GameSpotArticlesResponseModel getGameSpotArticles(@SpringQueryMap Map<String, String> gameSpotQueryParams);

}
