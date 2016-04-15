package com.jingoal.web.redis.sample.listerer;

import java.io.Serializable;

import com.jingoal.web.common.Keyable;
import com.jingoal.web.common.Message;

public interface RedisMessageDelegate<T extends Serializable> extends Keyable, MessageDelegate<Message<T>> {
	
}
