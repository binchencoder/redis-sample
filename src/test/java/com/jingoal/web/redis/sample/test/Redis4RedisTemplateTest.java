package com.jingoal.web.redis.sample.test;

import org.testng.annotations.Test;

import com.jingoal.web.redis.sample.BaseTest;

public class Redis4RedisTemplateTest extends BaseTest {

	@Test
	public void valueOperationsTest() {
		template.opsForValue().append("firstkey", "firstkey-value");
	}

	@Test
	public void ListOperationsTest(){
		template.opsForList().leftPush("", "");
	}
	
}
