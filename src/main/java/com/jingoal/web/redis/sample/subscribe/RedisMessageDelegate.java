package com.jingoal.web.redis.sample.subscribe;

import java.io.Serializable;

import com.jingoal.web.common.Keyable;
import com.jingoal.web.common.Message;
import com.jingoal.web.common.queue.MessageListener;

public interface RedisMessageDelegate<T extends Serializable> extends Keyable, MessageListener<Message<T>> {

	void handleMessage(Message<Serializable> message);

	void handleMessage(byte[] message);

	void handleMessage(Serializable message);

	// pass the channel/pattern as well
	void handleMessage(Serializable message, String channel);

}
