package com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.request;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class IgdbGameNewsParamsStringFactory {

	public String getGameNews(int limit, int offset) {
		IgdbGameNewsParams params = new IgdbGameNewsParams();

		List<String> fields = new ArrayList<>();
		fields.add("author");
		fields.add("image");
		fields.add("published_at");
		fields.add("pulse_source.*");
		fields.add("summary");
		fields.add("title");
		fields.add("website.*");

		params.setFields(fields);
		params.setSort("published_at desc");
		params.setLimit(limit);
		params.setOffset(offset);

		return params.getParamsString();
	}

}
