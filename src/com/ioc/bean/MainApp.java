package com.ioc.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
//		AbstractApplicationContext与ApplicationContext之间什么关系
		

		/**
		 * Spring Bean 作用域
		 */
//		ApplicationContext context = new ClassPathXmlApplicationContext("IocBeanBeans.xml");
//		HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld");
//		helloWorld1.setMessage("I'm object A");
//		helloWorld1.getMessage();
//		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
//		helloWorld2.getMessage();

		/**
		 * Spring Bean 生命周期
		 * 
		 * 如果你在非 web 应用程序环境中使用 Spring 的 IoC 容器；例如在丰富的客户端桌面环境中；那么在 JVM 中你要注册关闭 hook。
		 * 这样做可以确保正常关闭，为了让所有的资源都被释放，可以在单个 beans 上调用 destroy 方法。
		 */
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("IocBeanBeans.xml");
//		HelloWorld2 obj = (HelloWorld2) context.getBean("helloWorld2");
//		obj.getMessage();
//		context.registerShutdownHook();

		/**
		 * Spring Bean 后置处理器
		 * 
		 * Bean 后置处理器允许在调用初始化方法前后对 Bean 进行额外的处理。 BeanPostProcessor
		 * 接口定义回调方法，你可以实现该方法来提供自己的实例化逻辑，依赖解析逻辑等。你也可以在 Spring 容器通过插入一个或多个
		 * BeanPostProcessor 的实现来完成实例化，配置和初始化一个bean之后实现一些自定义逻辑回调方法。 你可以配置多个
		 * BeanPostProcessor 接口，通过设置 BeanPostProcessor 实现的 Ordered 接口提供的 order 属性来控制这些
		 * BeanPostProcessor 接口的执行顺序。 BeanPostProcessor 可以对 bean（或对象）实例进行操作，这意味着 Spring
		 * IoC 容器实例化一个 bean 实例，然后 BeanPostProcessor 接口进行它们的工作。 ApplicationContext 会自动检测由
		 * BeanPostProcessor 接口的实现定义的 bean，注册这些 bean 为后置处理器，然后通过在容器中创建 bean，在适当的时候调用它。
		 */
//		AbstractApplicationContext context3 = new ClassPathXmlApplicationContext("IocBeanBeans.xml");
//		HelloWorld3 obj = (HelloWorld3) context3.getBean("helloWorld3");
//		obj.getMessage();
//		context3.registerShutdownHook();

		
		/**
		 * Spring Bean 定义继承
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("IocBeanBeans.xml");
		HelloWorld4 objA = (HelloWorld4) context.getBean("helloWorld4");
		objA.getMessage1();
		objA.getMessage2();
		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
	}

}
