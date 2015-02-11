package com.mycompany.app;

public class FruitSlicer implements ISlicer{
	
	private IFruit fruit;
	
	public FruitSlicer(){
//		fruit = new IFruit() {
//			public String getName() {
//				return "unknown fruit";
//			}
//		};
	}
	
	public FruitSlicer(IFruit conv){
		this.fruit = conv;
	}
	
	public void slice() {
		System.out.println("Slicing " +fruit.getName());
	}

	public void multySlice() {
		System.out.println("!!! Not supported slicing !!!");
	}

	public IFruit getFruit() {
		return fruit;
	}

	public void setFruit(IFruit fruit) {
		this.fruit = fruit;
	}

}
