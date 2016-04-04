package com.jingoal.web.redis.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Test
	public void test1(){
		redisTemplate.unwatch();
	}
	
}
