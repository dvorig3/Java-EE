package com.mycompany.app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("orange")
@Scope("prototype")
public class Orange implements IFruit{

	public String getName() {
		return "orange";
	}
}
