package com.mycompany.app;

import java.util.Map;

public class Tester {

	public static void main(String[] args) {

		// Testing Fruits
		IFruit fruit = (IFruit) StaticInfo.CONTEXT.getBean("unknfr");
		System.out.println(fruit.getName());
		IFruit apple = (IFruit) StaticInfo.CONTEXT.getBean("apple");
		System.out.println(apple.getName());
		IFruit orange = (IFruit) StaticInfo.CONTEXT.getBean("orange");
		System.out.println(orange.getName());
		IFruit melon = (IFruit) StaticInfo.CONTEXT.getBean("melon");
		System.out.println(melon.getName());
		
		// Testing FruitSlicer
		{
			System.out.println("\n> Test instance of FruitSlicer created with a constructor by default");
			ISlicer fruitSlicer = (FruitSlicer) StaticInfo.CONTEXT
					.getBean("frSlNoArgs");
			fruitSlicer.slice();
			fruitSlicer.multySlice();
		}
		{
			System.out.println("\n> Test instance of FruitSlicer created with a constructor with parameter");
			ISlicer fruitSlicer = (FruitSlicer) StaticInfo.CONTEXT
					.getBean("frSlArg");
			fruitSlicer.slice();
			fruitSlicer.multySlice();
		}
		{
			System.out.println("\n> Test instance of FruitSlicer created with a constructor by default and properties");
			ISlicer fruitSlicer = (FruitSlicer) StaticInfo.CONTEXT
					.getBean("frSlProp");
			fruitSlicer.slice();
			fruitSlicer.multySlice();
		}
		
		// Testing FruitSlicerCombain
		{
			System.out.println("\n> Test instance of FruitSlicerCombain created with a constructor by default");
			ISlicer fruitSlicer = (FruitSlicer) StaticInfo.CONTEXT
					.getBean("frSlComNoArgs");
			fruitSlicer.slice();
			fruitSlicer.multySlice();
		}
		{
			System.out.println("\n> Test instance of FruitSlicerCombain created with a constructor with IFruit parameter");
			ISlicer fruitSlicer = (FruitSlicer) StaticInfo.CONTEXT
					.getBean("frSlComFruitArgs");
			fruitSlicer.slice();
			fruitSlicer.multySlice();
		}
		{
			System.out.println("\n> Test instance of FruitSlicerCombain created with a constructor with Map<String, IFruit> parameter");
			ISlicer fruitSlicer = (FruitSlicer) StaticInfo.CONTEXT
					.getBean("frSlComMapArgs");
			fruitSlicer.slice();
			fruitSlicer.multySlice();
		}
		{
			System.out.println("\n> Test instance of FruitSlicerCombain created with a constructor by default and properties");
			ISlicer fruitSlicer = (FruitSlicer) StaticInfo.CONTEXT
					.getBean("frSlComProp");
			fruitSlicer.slice();
			fruitSlicer.multySlice();
		}
	}

}
