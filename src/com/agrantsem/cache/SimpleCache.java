package com.agrantsem.cache;

import java.util.HashMap;
import java.util.Map;

public class SimpleCache<K,V> {
	private String name;
	private Map<K,V> cacheMap=new HashMap<K, V>();
	private CacheConfiguration config=null;
	private long lastUpdate=0;
	private Class<Runnable> classLoader;
	public SimpleCache(CacheConfiguration config,String name){
		this.name=name;
		this.config=config;
	}
	public synchronized void put(K key,V value){
		this.cacheMap.put(key, value);
		this.lastUpdate=System.currentTimeMillis();
	}
	public synchronized V get(K key){
		return this.cacheMap.get(key);
	}
	
	public synchronized void putAll(SimpleCache<K, V> simpleCache){
		this.cacheMap.putAll(simpleCache.cacheMap);
		this.lastUpdate=System.currentTimeMillis();
	}
	
	public synchronized void remove(K key){
		this.cacheMap.remove(key);
		this.lastUpdate=System.currentTimeMillis();
	}
	public synchronized void clear(){
		this.cacheMap.clear();
		this.lastUpdate=0;
	}
	public synchronized boolean contains(K key){
		return this.cacheMap.containsKey(key);
	}


}
