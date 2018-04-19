package com.qa.test;

import org.junit.Assert;
import org.junit.Test;

import com.qa.domain.Account;
import com.qa.domain.Service;

public class firstNameDuplicateTest {

	@Test
	public void fistNameDuplicateTest() {
		Service service = new Service();
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
