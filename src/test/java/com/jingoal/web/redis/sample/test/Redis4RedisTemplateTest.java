package com.jingoal.web.redis.sample.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.testng.annotations.Test;

import com.jingoal.web.redis.sample.BaseTest;

public class Redis4RedisTemplateTest extends BaseTest {

	@Autowired
	private JedisConnectionFactory jedisConnectionFactory;

	@Test
	public void valueOperationsTest() {
		template.opsForValue().append("firstkey", "firstkey-value");
	}

	@Test
	public void ListOperationsTest() {
		template.opsForList().leftPush("", "");
	}

	public void myTest() {
		// jedisConnectionFactory.getConnection().subscribe(listener, channels);
	}

}
