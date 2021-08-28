package com.CGI.accounts_txns.dao;

import java.util.List;

import com.CGI.accounts_txns.beans.accounts;
import com.CGI.accounts_txns.beans.transactions;

public interface accounts_txns_dao {

	public List<accounts> get_account_details();
	public List<transactions> get_transaction_details(String account_number);
}
