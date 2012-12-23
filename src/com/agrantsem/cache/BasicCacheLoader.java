package com.agrantsem.cache;

public abstract class BasicCacheLoader<K,V> implements Runnable{
	protected SimpleCache<K, V> cache=null;
	public BasicCacheLoader(SimpleCache<K, V> cache){
		this.cache=cache;
	}
}
