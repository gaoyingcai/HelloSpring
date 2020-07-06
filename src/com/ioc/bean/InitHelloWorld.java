package com.ioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeforeInitialization : " + beanName);
//		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("AfterInitialization : " + beanName);
//		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
		return bean;
	}
}
