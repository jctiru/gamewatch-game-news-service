package com.jctiru.gamewatch.api.gamewatchgamenewsservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.IgdbGameNewsServiceClient;
import com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.request.IgdbGameNewsParamsStringFactory;
import com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.response.GameNewsOverview;
import com.jctiru.gamewatch.api.gamewatchgamenewsservice.service.GameNewsService;

@Service
public class GameNewsServiceImpl implements GameNewsService {

	@Autowired
	private IgdbGameNewsServiceClient igdbGameNewsServiceClient;

	@Autowired
	private IgdbGameNewsParamsStringFactory igdbGameCatalogParamsStringFactory;

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

		return igdbGameNewsServiceClient
				.getGamesNewsList(igdbGameCatalogParamsStringFactory.getGameNews(limit, offset));
	}

}
