package com.qa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.domain.Account;
import com.qa.domain.JSONUtil;
import com.qa.domain.Service;

public class JSONconverterTest {

	@Test
	public void JSONconversionTest() {
		Service service = new Service();
		Account Ryan = new Account("Ryan","Prince",1);
		service.addAccount(Ryan);
		JSONUtil ju=new JSONUtil();
		String expected="{\"1\":{\"firstName\":\"Ryan\",\"lastName\":\"Prince\",\"accountNumber\":1}}";
		String actual=ju.getJSONForObject(service.getAccountMap());
		System.out.println(ju.getJSONForObject(service.getAccountMap()));
		assertEquals(expected,actual);
	}

}
