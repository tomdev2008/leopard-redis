package io.leopard.data4j.redis.test;

import io.leopard.autounit.inject.AbstractInject;
import io.leopard.data4j.redis.Redis;

import java.lang.reflect.Field;

public class AutoUnitInjectRedisImpl extends AbstractInject {

	@Override
	public boolean inject(Object bean, Field field) {
		if (!this.isNeedSetValue(bean, field, Redis.class)) {
			return false;
		}

		RedisH2Impl redis = new RedisH2Impl();
		super.setFieldValue(bean, field, redis);
		return true;
	}

}
