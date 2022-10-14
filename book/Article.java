package valtechspring.book;

import javax.persistence.Entity;

@Entity
public class Article extends Book {
	private String url;

	public Article() {
	}

	public Article(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}