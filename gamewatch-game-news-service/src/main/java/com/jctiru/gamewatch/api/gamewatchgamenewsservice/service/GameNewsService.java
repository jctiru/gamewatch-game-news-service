package com.jctiru.gamewatch.api.gamewatchgamenewsservice.service;

import java.util.List;

import com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.response.GameNewsOverview;

public interface GameNewsService {

	List<GameNewsOverview> getGameNews(int limit, int page);

}
