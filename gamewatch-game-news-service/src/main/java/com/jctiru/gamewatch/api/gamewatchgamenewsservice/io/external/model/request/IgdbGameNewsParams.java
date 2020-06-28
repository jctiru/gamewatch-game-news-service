package com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.request;

import java.util.List;

public class IgdbGameNewsParams {

	private List<String> fields;
	private List<String> conditions;
	private String sort;
	private int limit;
	private int offset;

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public List<String> getConditions() {
		return conditions;
	}

	public void setConditions(List<String> conditions) {
		this.conditions = conditions;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getParamsString() {
		String fieldParamsString = "fields " + String.join(", ", this.fields) + ";";
		String conditionParamsString = this.conditions != null ? "where " + String.join(" & ", this.conditions) + ";"
				: "";
		String sortParamString = "sort " + this.sort + ";";
		String limitParamString = "limit " + Integer.toString(this.limit) + ";";
		String offsetParamString = "offset " + Integer.toString(this.offset) + ";";

		return String.join(" ", fieldParamsString, conditionParamsString, sortParamString, limitParamString,
				offsetParamString);
	}

}
