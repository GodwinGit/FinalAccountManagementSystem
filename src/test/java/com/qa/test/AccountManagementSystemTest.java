package com.qa.test;
import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.qa.domain.Account;
import com.qa.domain.JSONUtil;
import com.qa.domain.Service;

public class AccountManagementSystemTest {
	 
	Service service;
	
	@Before
	public void setUp() {
		service = new Service();
		
	}
	

	@Test
	public void addAccountTest() {
		Account Ryan = new Account("Ryan","Prince",1);
		service.addAccount(Ryan);
		Integer expected=1;
		Integer actual=service.getAccountMap().size();
		assertEquals(expected,actual);
	}
	
	@Test
	public void removeAccountTest() {
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
	
	@Test
	public void getAccountTest() {
		Account Ryan = new Account("Ryan","Prince",1);
		Account Godwin = new Account("Godwin","Adeleke",2);
		service.addAccount(Ryan);
		service.addAccount(Godwin);
		Account expected = Ryan;
		Account actual = service.getAccount(1);
		assertEquals(expected,actual);
		
		
	}
	@Test
	public void JSONconversionTest() {
		Account Ryan = new Account("Ryan","Prince",1);
		service.addAccount(Ryan);
		JSONUtil ju=new JSONUtil();
		String expected="{\"1\":{\"firstName\":\"Ryan\",\"lastName\":\"Prince\",\"accountNumber\":1}}";
		String actual=ju.getJSONForObject(service.getAccountMap());
		System.out.println(ju.getJSONForObject(service.getAccountMap()));
		assertEquals(expected,actual);
	}
	
	@Test
	public void fistNameDuplicateTest() {
		Account Godwin = new Account("Godwin","Adeleke",1);
	    Account Godwin1 = new Account("Godwin","Prince",2);
	    Account Godwin2 = new Account("Godwin","Abdi",3);
        service.addAccount(Godwin);
		service.addAccount(Godwin1);
		service.addAccount(Godwin2);
		int expected = 3;
		int actual = service.getNumOfDuplicates("Godwin");
		Assert.assertEquals(expected,actual);
		
		
		
		
		
		
	}
}
