package com.CGI.accounts_txns.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CGI.accounts_txns.beans.accounts;
import com.CGI.accounts_txns.beans.transactions;
import com.CGI.accounts_txns.service.accountService;


@RestController

public class acc_tx_controller {


		@Autowired
		accountService accService;
		
		@GetMapping("/accountDetails")
		public ResponseEntity<List<accounts>> getAccountDetails()
		{
			System.out.println("Acssacounts hello");
			return new ResponseEntity<>(accService.getAccountDetService(), HttpStatus.OK);
			
			
		}
		
		@PostMapping("/transactionDetailsForAcc")
		public ResponseEntity<List<transactions>> getTransactionsForIndividualAccount(@RequestBody transactions tx)
		{
			System.out.println("Acssacounts hello tx "+tx.getAccount_number());
			return new ResponseEntity<>(accService.getTransactionsForIndividualAccountService(tx.getAccount_number()),HttpStatus.OK);
		}
		
	}


