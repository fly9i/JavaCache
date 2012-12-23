package com.agrantsem.cache;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CacheManager {
	private static final String DEFAULT_NAME="__default__";
	private static CacheManager manager=new CacheManager();
	private static Map<String,SimpleCache> cacheMap=new HashMap<String,SimpleCache>();
	private CacheManager(){};
	public static CacheManager getInstance(){
		return manager;
	}
	public synchronized static SimpleCache getCache(CacheConfiguration config){
		SimpleCache sc=cacheMap.get(DEFAULT_NAME);
		if(sc==null){
			sc=new SimpleCache(config,DEFAULT_NAME);
		}
	
		return sc;
	}
	public synchronized static SimpleCache getCache(CacheConfiguration config,String name){
		SimpleCache sc=cacheMap.get(name);
		if(sc==null){
			sc=new SimpleCache(config,name);
			cacheMap.put(name, sc);
		}
		return sc;
	}
//	public synchronized 
	
}
