package com.mycompany.app;

import javax.validation.constraints.NotNull;
import static com.mycompany.app.StaticInfo.*; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FruitSlicer implements ISlicer {

	@NotNull
	@Qualifier(QUALIFIER_COMPONENT_FRUIT)
	@Autowired
	private IFruit fruit;

	public FruitSlicer() {
		System.out.println("  ... calling FruitSlicer()");
		setwFruit((IFruit) SERVICE_CONTEXT.getBean("unknfr"));
	}

	public FruitSlicer(@NotNull IFruit fruit) {
		System.out.println("  ... calling FruitSlicer(fruit)");
		setwFruit(fruit);
	}

	public void slice() {
		System.out.println("  ... calling slice()");
		System.out.println(">> Slicing " + fruit.getName());
	}

	public void multySlice() {
		System.out.println("  ... calling multySlice()");
		System.out
				.println(">> !!! This slicer does not support multy slicing !!!");
	}

	public IFruit getFruit() {
		System.out.println("  ... calling getFruit()");
		return fruit;
	}

	public void setwFruit(@NotNull IFruit fruit) {
		System.out.println("  ... calling setFruit()");
		this.fruit = fruit;
	}

}
