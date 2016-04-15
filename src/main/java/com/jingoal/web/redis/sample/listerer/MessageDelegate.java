package com.jingoal.web.redis.sample.listerer;

import java.io.Serializable;

public interface MessageDelegate<T extends Serializable> {
	
	void handleMessage(T message);
	
}