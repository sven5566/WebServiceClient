package com.whr;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml"); 
//		User bean = (User)context.getBean("user");
//		bean.add();
		ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml"); 
		HelloWorldI bean = (HelloWorldI)context.getBean("myServer");
		System.out.println(bean.sayHi("wwwwwwwwwwwwwwu"));
//		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();  
//        factoryBean.setServiceClass(HelloWorldI.class);  
//        factoryBean.setAddress("http://localhost:8089/whr");  
//          
//        HelloWorldI readerService = (HelloWorldI)factoryBean.create();  
//        System.out.println("Reader:"+readerService.sayHi("Œ‚∫∆»ª"));  
	}
}
