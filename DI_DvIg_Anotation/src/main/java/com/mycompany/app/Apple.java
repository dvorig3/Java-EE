package com.mycompany.app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("apple")
@Scope("prototype")
public class Apple implements IFruit{

	public String getName() {
		return "apple";
	}

}
