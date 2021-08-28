package com.CGI.accounts_txns.beans;


import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class accounts {

	String account_Number;
	String account_Name;
	String account_Type;
	Date balance_Date;
	String currency;
	BigDecimal available_balance;
	
	public accounts()
	{
		
	}

	public accounts(String account_Number, String account_Name, String account_Type, Date balance_Date, String currency,
			BigDecimal available_balance) {
		super();
		this.account_Number = account_Number;
		this.account_Name = account_Name;
		this.account_Type = account_Type;
		this.balance_Date = balance_Date;
		this.currency = currency;
		this.available_balance = available_balance;
	}

	public String getAccount_Number() {
		return account_Number;
	}

	public void setAccount_Number(String account_Number) {
		this.account_Number = account_Number;
	}

	public String getAccount_Name() {
		return account_Name;
	}

	public void setAccount_Name(String account_Name) {
		this.account_Name = account_Name;
	}

	public String getAccount_Type() {
		return account_Type;
	}

	public void setAccount_Type(String account_Type) {
		this.account_Type = account_Type;
	}

	public Date getBalance_Date() {
		return balance_Date;
	}

	public void setBalance_Date(Date balance_Date) {
		this.balance_Date = balance_Date;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public 	BigDecimal getAvailable_balance() {
		return available_balance;
	}

	public void setAvailable_balance(BigDecimal available_balance) {
		this.available_balance = available_balance;
	}
	
	
}