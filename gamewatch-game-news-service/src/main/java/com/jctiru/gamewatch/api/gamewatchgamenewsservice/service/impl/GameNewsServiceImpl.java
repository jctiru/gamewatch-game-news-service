package com.jctiru.gamewatch.api.gamewatchgamenewsservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.GameSpotArticlesServiceClient;
import com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.request.GameSpotArticlesQueryParamsFactory;
import com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.response.GameNewsOverview;
import com.jctiru.gamewatch.api.gamewatchgamenewsservice.service.GameNewsService;

@Service
public class GameNewsServiceImpl implements GameNewsService {

	@Autowired
	private GameSpotArticlesServiceClient gameSpotArticlesServiceClient;

	@Autowired
	private GameSpotArticlesQueryParamsFactory gameSpotArticlesQueryParamsFactory;

	@Override
	public List<GameNewsOverview> getGameNews(int limit, int page) {
		if (page < 1) {
			page = 1;
		}

		if (limit < 0) {
			limit = 1;
		}

		int pageValue = page - 1;
		int offset = limit * pageValue;

		return gameSpotArticlesServiceClient
				.getGameSpotArticles(gameSpotArticlesQueryParamsFactory.getGameNews(limit, offset)).getResults();
	}

}
