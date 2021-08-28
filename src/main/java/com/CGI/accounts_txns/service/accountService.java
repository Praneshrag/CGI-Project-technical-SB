package com.CGI.accounts_txns.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CGI.accounts_txns.beans.accounts;
import com.CGI.accounts_txns.beans.transactions;
import com.CGI.accounts_txns.dao.accounts_txns_dao_impl;



@Service
public class accountService {

	@Autowired(required=true)
	accounts_txns_dao_impl accimpl;
	
	public List<accounts> getAccountDetService()
	{
		
		return accimpl.get_account_details();
	}

	public List<transactions> getTransactionsForIndividualAccountService(String account_Number) {
		// TODO Auto-generated method stub
		System.out.println("service "+account_Number);
		return accimpl.get_transaction_details(account_Number);
	}
}