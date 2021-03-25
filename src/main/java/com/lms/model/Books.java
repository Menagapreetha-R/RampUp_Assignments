package com.lms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Books {
	@Id
	@Column
	private int bookid;
	@Column
	private String author;
	@Column
	private String bookname;
	@Column
	private int numberofpages;
	@Column
	private int price;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getNumberofpages() {
		return numberofpages;
	}
	public void setNumberofpages(int numberofpages) {
		this.numberofpages = numberofpages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", author=" + author + ", bookname=" + bookname + ", numberofpages="
				+ numberofpages + ", price=" + price + "]";
	}
	
	

}
