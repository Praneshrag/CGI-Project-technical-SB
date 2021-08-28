package com.CGI.accounts_txns.dao;

import java.math.BigDecimal;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.CGI.accounts_txns.beans.accounts;
import com.CGI.accounts_txns.beans.transactions;

@Repository
public class accounts_txns_dao_impl implements accounts_txns_dao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<accounts> get_account_details() {
		
		// TODO Auto-generated method stub
		String sql = "select * from cgidb.accounts";
		
		List<accounts> list_of_accounts = new ArrayList<accounts>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        for (Map<String,Object> row : rows) {
            accounts obj = new accounts();
            obj.setAccount_Number(row.get("Account_Number").toString());
            obj.setAccount_Name(row.get("Account_Name").toString());
            obj.setAccount_Type(row.get("Account_Type").toString());
            obj.setBalance_Date((Date) row.get("Balance_Date"));
            obj.setCurrency(row.get("Currency").toString());
            obj.setAvailable_balance((BigDecimal) row.get("Available_Balance"));
            list_of_accounts.add(obj);
         
        }

        return list_of_accounts;
	}

	@Override
	public List<transactions> get_transaction_details(String account_number) {
		// TODO Auto-generated method stub
		String sql1 = "select * from cgidb.transactions where account_number = ?";
		
		List<transactions> list_of_transactions = new ArrayList<transactions>();
		System.out.println("repo layer "+account_number);
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql1, account_number);
		System.out.println("row size is "+ rows.size());
		for (Map<String,Object> row : rows) {
            transactions obj = new transactions();
            
           if(rows.size() >0 ) {
            obj.setAccount_number(row.get("Account_Number").toString());
            obj.setTransaction_number(row.get("Transaction_Number").toString());
            obj.setAccount_name(row.get("Account_Name").toString());
            obj.setValue_date((Date) row.get("Value_Date"));
            obj.setCurrency(row.get("Currency").toString());
            obj.setDebit_amount((BigDecimal) row.get("Debit_Amount"));
            obj.setCredit_amount((BigDecimal) row.get("Credit_Amount"));
            obj.setTransaction_type(row.get("Transaction_Type").toString());
            obj.setTransaction_narrative(row.get("Transaction_Narrative").toString());
            list_of_transactions.add(obj);
        		  }
           
            
		}
		
		return list_of_transactions;
		
	}

}
