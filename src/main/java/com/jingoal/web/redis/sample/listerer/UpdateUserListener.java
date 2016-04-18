package com.jingoal.web.redis.sample.listerer;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jingoal.web.redis.RedisMessage;
import com.jingoal.web.redis.RedisMessageListener;
import com.jingoal.web.redis.RedisProducer;

@Component
public class UpdateUserListener implements RedisMessageListener<Serializable> {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(UpdateUserListener.class);

	@Autowired
	private RedisProducer<Serializable> redisProducer;

	@Override
	public String key() {
		return "updateuser.message";
	}

	@Override
	public void onMessage(RedisMessage<Serializable> message) {

		logger.info("onMessage");

		System.out.println("come in UpdateUserListener, retry : " + message.getRetry());

	}
}
