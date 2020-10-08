package com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class GameSpotArticlesQueryParamsFactory {

	public Map<String, String> getGameNews(int limit, int offset) {
		Map<String, String> queryParams = new HashMap<>();

		List<String> fieldList = new ArrayList<>();
		fieldList.add("id");
		fieldList.add("authors");
		fieldList.add("title");
		fieldList.add("deck");
		fieldList.add("image");
		fieldList.add("publish_date");
		fieldList.add("update_date");
		fieldList.add("site_detail_url");

		queryParams.put("field_list", String.join(",", fieldList));
		queryParams.put("limit", Integer.toString(limit));
		queryParams.put("offset", Integer.toString(offset));
		queryParams.put("sort", "publish_date:desc");
		queryParams.put("filter", "categories:18");

		return queryParams;
	}

}
