package com.javaex.ex10;

public class Book {

	//필드
	private int bookNo, stateCode;
	private String title, author;
	
	//생성자
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	//메소드 1. getter setter
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	//메소드 2. 도서대출
	public void rent() {
		this.stateCode = 0;
		System.out.println(title+"이(가) 대출되었습니다.");
	}
	
	// 메소드 3. 도서 정보 프린트
	public void print()  {
		String statePrint = null;
		switch(stateCode) {
		case 1:
			statePrint = "재고있음";
			break;
		default :
			statePrint = "대여중";
		}//switch
		System.out.println(bookNo+". "+"책 제목: "+title+", 작가: "+author+", 대여유무: "+statePrint);
	}
	
	
	
	
}
