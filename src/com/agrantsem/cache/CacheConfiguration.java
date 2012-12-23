package com.agrantsem.cache;

public class CacheConfiguration {
	private long maxTimeOut=0;
	private long minTimeOut=0;
	private Class<Runnable> loader=null;
	public CacheConfiguration(long maxTimeout,long minTimeout,Class<Runnable> loader){
		this.maxTimeOut=maxTimeout;
		this.minTimeOut=minTimeout;
		this.loader=loader;
	}
	public long getMaxTimeOut() {
		return maxTimeOut;
	}
	public void setMaxTimeOut(long maxTimeOut) {
		this.maxTimeOut = maxTimeOut;
	}
	public long getMinTimeOut() {
		return minTimeOut;
	}
	public void setMinTimeOut(long minTimeOut) {
		this.minTimeOut = minTimeOut;
	}
	public Class<Runnable> getLoader() {
		return loader;
	}
	public void setLoader(Class<Runnable> loader) {
		this.loader = loader;
	}
	
	
}
