package com.qa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.domain.Account;
import com.qa.domain.Service;

public class getAccountTest {

	@Test
		public void getAccountTest() {
			Service service = new Service();		
			Account Ryan = new Account("Ryan","Prince",1);
			Account Godwin = new Account("Godwin","Adeleke",2);
			service.addAccount(Ryan);
			service.addAccount(Godwin);
			Account expected = Ryan;
			Account actual = service.getAccount(1);
			assertEquals(expected,actual);
	}

}
