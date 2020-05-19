package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member m01 = new Member("jws", "정우성", 50000);
		Member m02 = new Member("yjs", "유재석", 30000);
		Member m03 = new Member("lhr", "이효리", 40000);
		
		m01.showInfo();
		m02.showInfo();
		m03.showInfo();
		
	}
}
