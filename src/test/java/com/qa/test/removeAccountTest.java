package com.qa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.domain.Account;
import com.qa.domain.Service;

public class removeAccountTest {

	@Test
	public void removeAccountTest() {
		Service service = new Service();
		Account Ryan = new Account("Ryan","Prince",1);
		Account Godwin = new Account("Godwin","Adeleke",2);
		service.addAccount(Ryan);
		service.addAccount(Godwin);
		service.removeAccount(Godwin);
		Integer expected=1;
		Integer actual=service.getAccountMap().size();
		assertEquals(expected,actual);
		assertFalse(service.getAccountMap().containsValue(Godwin));
	}

}
