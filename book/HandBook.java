package valtechspring.book;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class HandBook extends Book {
	private String isbn;
	private double price;
	private int publishedYr;
	private int edition;

	public HandBook() {
	}

	public HandBook(String isbn, double price, int publishedYr, int edition) {
		this.isbn = isbn;
		this.price = price;
		this.publishedYr = publishedYr;
		this.edition = edition;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPublishedYr() {
		return publishedYr;
	}

	public void setPublishedYr(int publishedYr) {
		this.publishedYr = publishedYr;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

}