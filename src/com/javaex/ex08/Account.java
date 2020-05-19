package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;

    
    //생성자
    public Account() {}
    
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }


	//메소드 : getter setter
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
    
	
	//일반메소드
	public void showAccount() {
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}
	
	public void deposit(int money) {
		balance+=money;
	}
	
	public void withdraw(int money) {
		balance-=money;
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
    


}
