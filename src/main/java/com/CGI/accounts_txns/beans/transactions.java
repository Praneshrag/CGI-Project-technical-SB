package com.CGI.accounts_txns.beans;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class transactions {

	String account_number;
	String transaction_number;
	String account_name;
	Date value_date;
	String currency;
	BigDecimal debit_amount;
	BigDecimal credit_amount;
	String transaction_type;
	String transaction_narrative;
	
	public transactions()
	{
		
	}

	
	
	public transactions(String account_number, String transaction_number, String account_name, Date value_date,
			String currency, BigDecimal debit_amount, BigDecimal credit_amount, String transaction_type,
			String transaction_narrative) {
		super();
		this.account_number = account_number;
		this.transaction_number = transaction_number;
		this.account_name = account_name;
		this.value_date = value_date;
		this.currency = currency;
		this.debit_amount = debit_amount;
		this.credit_amount = credit_amount;
		this.transaction_type = transaction_type;
		this.transaction_narrative = transaction_narrative;
	}



	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getTransaction_number() {
		return transaction_number;
	}

	public void setTransaction_number(String transaction_number) {
		this.transaction_number = transaction_number;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public Date getValue_date() {
		return value_date;
	}

	public void setValue_date(Date value_date) {
		this.value_date = value_date;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getDebit_amount() {
		return debit_amount;
	}

	public void setDebit_amount(BigDecimal debit_amount) {
		this.debit_amount = debit_amount;
	}

	public BigDecimal getCredit_amount() {
		return credit_amount;
	}

	public void setCredit_amount(BigDecimal credit_amount) {
		this.credit_amount = credit_amount;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getTransaction_narrative() {
		return transaction_narrative;
	}

	public void setTransaction_narrative(String transaction_narrative) {
		this.transaction_narrative = transaction_narrative;
	}
	
	
}
