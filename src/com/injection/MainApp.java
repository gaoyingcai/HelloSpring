package com.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		/**
		 * Spring 基于构造函数的依赖注入
		 */
//		ApplicationContext context = new ClassPathXmlApplicationContext("InjectionBeans.xml");
//		TextEditor te = (TextEditor) context.getBean("textEditor");
//		te.spellCheck();

		/**
		 * Spring 设置函数的依赖注入
		 */
//		ApplicationContext context = new ClassPathXmlApplicationContext("InjectionBeans.xml");
//		TextEditor2 te = (TextEditor2) context.getBean("textEditor2");
//		te.spellCheck();

		/**
		 * Spring 注入内部Beans
		 */
//		ApplicationContext context = new ClassPathXmlApplicationContext("InjectionBeans.xml");
//		TextEditor2 te = (TextEditor2) context.getBean("textEditor2");
//		te.spellCheck();

		/**
		 * Spring 注入集合
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("InjectionBeans.xml");
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();

	}
}
