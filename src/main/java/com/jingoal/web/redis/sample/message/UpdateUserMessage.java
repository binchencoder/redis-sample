package com.jingoal.web.redis.sample.message;

import com.jingoal.web.redis.RedisMessage;
import com.jingoal.web.redis.sample.model.User;

public class UpdateUserMessage extends RedisMessage<User> {

	public UpdateUserMessage(User m) {
		super(m);
	}

	private static final long serialVersionUID = 1L;

	/**
	 * 消息缓存或持久化的时长,默认一月
	 * 
	 * @return 时长为秒
	 */
	@Override
	public int expire() {
		return 25920000; // 一月
	}

	@Override
	public String key() {
		return "updateuser.message";
	}

}
