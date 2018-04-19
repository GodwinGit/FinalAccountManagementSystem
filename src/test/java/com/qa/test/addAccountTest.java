package com.qa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.domain.Account;
import com.qa.domain.Service;

public class addAccountTest {

	@Test
	public void addAccountTest() {
		Service service = new Service();
		Account Ryan = new Account("Ryan","Prince",1);
		service.addAccount(Ryan);
		Integer expected=1;
		Integer actual=service.getAccountMap().size();
		assertEquals(expected,actual);
	}
	

}
