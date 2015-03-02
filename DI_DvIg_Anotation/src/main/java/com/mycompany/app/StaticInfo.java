package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticInfo {
	static final ApplicationContext SERVICE_CONTEXT = new ClassPathXmlApplicationContext(
			"ServiceBeanConfig.xml");
	static final ApplicationContext CONTEXT = new ClassPathXmlApplicationContext(
			"MainBeanConfig.xml");
	static final String QUALIFIER_COMPONENT_FRUIT = "genericFruit";
}
