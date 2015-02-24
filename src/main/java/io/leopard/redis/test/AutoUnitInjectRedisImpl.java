package io.leopard.redis.test;

import io.leopard.autounit.inject.AbstractInject;
import io.leopard.autounit.inject.Inject;
import io.leopard.redis.Redis;

import java.lang.reflect.Field;

public class AutoUnitInjectRedisImpl extends AbstractInject {

	@Override
	public Inject inject(Object bean, Field field) {
		if (!this.isNeedSetValue(bean, field, Redis.class)) {
			return null;
		}

		RedisH2Impl redis = new RedisH2Impl();
		super.setFieldValue(bean, field, redis);
		return this;
	}

	@Override
	public boolean clean() {
		// TODO Auto-generated method stub
		return false;
	}

}
