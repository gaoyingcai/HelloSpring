package com.ioc.bean;

public class HelloWorld2 {
	protected String message;

	public void setMessage(String message) {
		this.message = message;
	}
	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	/**
	 * 建议你不要使用 InitializingBean 或者 DisposableBean 的回调方法，因为 XML 配置在命名方法上提供了极大的灵活性。
	 */
	public void init() {
		System.out.println("Bean is going through init.");
	}
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
	
}
