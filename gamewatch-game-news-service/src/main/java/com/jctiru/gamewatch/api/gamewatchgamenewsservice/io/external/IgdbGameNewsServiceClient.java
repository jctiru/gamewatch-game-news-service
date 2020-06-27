package com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.response.GameNewsOverview;

@FeignClient(name = "igdb-game-news-service", url = "https://api-v3.igdb.com/pulses")
public interface IgdbGameNewsServiceClient {

	@PostMapping
	public List<GameNewsOverview> getGamesNewsList(@RequestBody String igdbParams);

}
