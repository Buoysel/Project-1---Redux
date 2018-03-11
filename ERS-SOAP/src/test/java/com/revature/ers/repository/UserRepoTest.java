package com.revature.ers.repository;

import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.ers.bean.ERSUser;
import com.revature.ers.bean.UserRole;
import com.revature.ers.service.UserService;

public class UserRepoTest {
	
	@Autowired
	public UserService userService;
	
	@Before
	public void beforeMessage() {
		System.out.println("Before a UserRepoTest method...");
	}

	@Test
	public void test() {
		/*Note: I tried to setup a break point here and run the test,  but the JUnit ran an failed without giving an error.
		 * So does DI not work with unit testing? I seem to recall my Mockito failure ending the same way...*/
		ERSUser user = new ERSUser(
				"Buoysel", "Otteres", "buoyott@eso.com", "478-733-2431", "Sonic260", "buizel", new UserRole(1)
			);
		userService.addUser(user);
		assertNotEquals(null, user);
	}

	@After
	public void afterMessage() {
		System.out.println("...after a UserRepoTest method");
	}
}
