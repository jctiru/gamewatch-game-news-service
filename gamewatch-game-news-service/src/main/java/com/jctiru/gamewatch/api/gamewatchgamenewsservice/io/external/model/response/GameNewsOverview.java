package com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.response;

public class GameNewsOverview {

	private long id;
	private String author;
	private String image;
	private long published_at;
	private PulseSource pulse_source;
	private String summary;
	private String title;
	private Website website;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public long getPublished_at() {
		return published_at;
	}

	public void setPublished_at(long published_at) {
		this.published_at = published_at;
	}

	public PulseSource getPulse_source() {
		return pulse_source;
	}

	public void setPulse_source(PulseSource pulse_source) {
		this.pulse_source = pulse_source;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Website getWebsite() {
		return website;
	}

	public void setWebsite(Website website) {
		this.website = website;
	}

}
