package com.mycompany.app;

import static com.mycompany.app.StaticInfo.*; 


public class Tester {

	public static void main(String[] args) {
		// <------ Test FruitSlicer ------>
		System.out.println("Test FruitSlicer -------------------");
		
		ISlicer slicer = CONTEXT.getBean("slicerOrion",
				ISlicer.class);
		slicer.slice();
		slicer.multySlice();
		
		// <------ Test FruitSlicerCombain ------>
		System.out.println("Test FruitSlicerCombain ------------");
		
		ISlicer superSlicer = CONTEXT.getBean("multySlicerSuper", ISlicer.class);
		superSlicer.slice();
		superSlicer.multySlice();
		
	}
}
