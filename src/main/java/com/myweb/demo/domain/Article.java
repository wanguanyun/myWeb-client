package com.myweb.demo.domain;

public class Article {
	private String articleName;
	private String userName;
	private String articleContent;
	private Integer articleTime;
	private Integer articleId;
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public Integer getArticleTime() {
		return articleTime;
	}
	public void setArticleTime(Integer articleTime) {
		this.articleTime = articleTime;
	}
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
}
