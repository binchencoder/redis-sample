package com.jingoal.web.redis.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring/applicationContext-redis.xml" })
@TransactionConfiguration(defaultRollback = true)
public class BaseTest extends AbstractTestNGSpringContextTests {
	@Test
	public void test() {
		System.out.println("I'm basic test");
	}
}
