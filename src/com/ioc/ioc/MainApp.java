package com.ioc.ioc;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/**
		 * Spring BeanFactory 容器
		 * 
		 * 1 第一步利用框架提供的 XmlBeanFactory() API 去生成工厂 bean 以及利用 ClassPathResource() API 去加载在路径 CLASSPATH 下可用的 bean 配置文件。
		 * XmlBeanFactory() API 负责创建并初始化所有的对象，即在配置文件中提到的 bean。
		 * 2 第二步利用第一步生成的 bean 工厂对象的 getBean() 方法得到所需要的 bean。 
		 * 这个方法通过配置文件中的 bean ID 来返回一个真正的对象，该对象最后可以用于实际的对象。一旦得到这个对象，你就可以利用这个对象来调用任何方法。
		 */
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("IocIocBeans.xml"));
		HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");
		helloWorld.getMessage();
		
		
		/**
		 * Spring ApplicationContext 容器
		 * 
		 * Application Context 是 BeanFactory 的子接口，也被成为 Spring 上下文。
		 * Application Context 是 spring 中较高级的容器。
		 * 和BeanFactory 类似，它可以加载配置文件中定义的 bean，将所有的 bean 集中在一起，当有请求的时候分配 bean。 
		 * 另外，它增加了企业所需要的功能，比如，从属性文件中解析文本信息和将事件传递给所指定的监听器。
		 * 这个容器在 org.springframework.context.ApplicationContext interface 接口中定义。
		 * ApplicationContext 包含 BeanFactory 所有的功能，一般情况下，相对于 BeanFactory，ApplicationContext 会更加优秀。
		 * 
		 * 1 第一步是我们使用框架 API ClassPathXmlApplicationContext() 来创建应用程序的上下文。
		 * 这个 API 加载 beans 的配置文件并最终基于所提供的 API，它处理创建并初始化所有的对象，即在配置文件中提到的 beans。
		 * 2 是使用已创建的上下文的 getBean() 方法来获得所需的 bean。
		 * 这个方法使用bean的ID返回一个最终可以转换为实际对象的通用对象。
		 *
		 *FileSystemXmlApplicationContext：需要提供给构造器完整路径。
		 *ClassPathXmlApplicationContext：不需要提供完整路径,只需正确配置CLASSPATH环境变量即可,容器会从CLASSPATH中搜索bean配置文件。
		 *WebXmlApplicationContext：该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。
		 *
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("IocIocBeans.xml");
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
		helloWorld2.getMessage();
		
	}
}
