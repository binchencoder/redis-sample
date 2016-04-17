package com.jingoal.web.redis.sample.subscribe;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.jingoal.web.common.Message;

@Component
public class SampleDelegate implements RedisMessageDelegate<Serializable>{

	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(SampleDelegate.class);
	
	@Override
	public String key() {
		return "chenbin.message";
	}
	
	@Override
	public void onMessage(Message<Serializable> message) {
		logger.info("onMessage");
		
		System.out.println("come in SampleListener");
		System.err.println(message.getParams());
		System.err.println(message.getPayload());
	}

	@Override
	public void handleMessage(byte[] message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleMessage(Serializable message) {
		// TODO Auto-generated method stub
		System.out.println("handleMessage");
	}

	@Override
	public void handleMessage(Serializable message, String channel) {
		// TODO Auto-generated method stub
		System.out.println("handleMessage");
	}

	@Override
	public void handleMessage(Message<Serializable> message) {
		// TODO Auto-generated method stub
		System.out.println("handleMessage");
	}
	
}
