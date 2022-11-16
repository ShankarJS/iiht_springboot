package com.digitalbooks.casestudy;

import java.util.Date;

public class Book {
	private String logo;
	private String title;
	private String category;
	private double price;
	private String author;
	private String publisher;
	private Date date;
	private String chapters_content;
	private boolean active;
	
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getChapters_content() {
		return chapters_content;
	}
	public void setChapters_content(String chapters_content) {
		this.chapters_content = chapters_content;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Book [logo=" + logo + ", title=" + title + ", category=" + category + ", price=" + price + ", author="
				+ author + ", publisher=" + publisher + ", date=" + date + ", chapters_content=" + chapters_content
				+ ", active=" + active + "]";
	}
	
	
	
}
