package com.jctiru.gamewatch.api.gamewatchgamenewsservice.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.response.GameNewsOverview;
import com.jctiru.gamewatch.api.gamewatchgamenewsservice.service.GameNewsService;

@RestController
@RequestMapping("/game-news")
public class GameNewsController {

	@Autowired
	private GameNewsService gameNewsService;

	@GetMapping
	public List<GameNewsOverview> getGameNews(@RequestParam(value = "limit", defaultValue = "20") int limit,
			@RequestParam(value = "page", defaultValue = "1") int page) {
		return gameNewsService.getGameNews(limit, page);
	}

}
