package com.dev.app.basicrestapi.book.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Book {
	@Id
	String id;
	String title;
	String author;
	String language;
	String noOfPages;
	String releaseDate;
	String publisher;
	String type;
	String noOfCopiesSold;
	String price;
	
}
