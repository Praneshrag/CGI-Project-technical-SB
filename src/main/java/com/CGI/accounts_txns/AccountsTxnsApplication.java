package com.CGI.accounts_txns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"com.CGI.accounts_txns.controller","com.CGI.accounts_txns.service","com.CGI.accounts_txns.beans"})
public class AccountsTxnsApplication {

	public static void main(String[] args) {
		System.out.println("sskk");
		SpringApplication.run(AccountsTxnsApplication.class, args);
	}

}
