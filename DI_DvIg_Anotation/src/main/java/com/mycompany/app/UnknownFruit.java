package com.mycompany.app;

import org.springframework.stereotype.Component;

@Component(StaticInfo.QUALIFIER_COMPONENT_FRUIT)

public class UnknownFruit implements IFruit{

	public String getName() {
		return "unknown fruit";
	}

}
