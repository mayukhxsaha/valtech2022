package valtechspring.book;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Blog extends Book {
	private String url;
	private int vistiedNo;

	public Blog() {
	}

	public Blog(String url, int visitedNo) {
		this.url = url;
		this.vistiedNo = visitedNo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getVistiedNo() {
		return vistiedNo;
	}

	public void setVistiedNo(int vistiedNo) {
		this.vistiedNo = vistiedNo;
	}

}
