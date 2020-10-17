package com.adanh.ws;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BugTrackerApplicationContext implements ApplicationContextAware{

	@SuppressWarnings("unused")
	private static ApplicationContext CONTEXT;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		CONTEXT= applicationContext;
		
	}

}
