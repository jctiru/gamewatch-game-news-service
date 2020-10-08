package com.jctiru.gamewatch.api.gamewatchgamenewsservice.io.external.model.response;

public class GameNewsOverview {

	private long id;
	private String authors;
	private String publish_date;
	private String update_date;
	private String title;
	private String deck;
	private String site_detail_url;
	private GameSpotArticleImage image;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDeck() {
		return deck;
	}

	public void setDeck(String deck) {
		this.deck = deck;
	}

	public String getSite_detail_url() {
		return site_detail_url;
	}

	public void setSite_detail_url(String site_detail_url) {
		this.site_detail_url = site_detail_url;
	}

	public GameSpotArticleImage getImage() {
		return image;
	}

	public void setImage(GameSpotArticleImage image) {
		this.image = image;
	}

}
