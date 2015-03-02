package com.mycompany.app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("melon")
@Scope("prototype")
public class Melon  implements IFruit{

	public String getName() {
		return "melon";
	}
}
