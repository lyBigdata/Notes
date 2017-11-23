package com.pattern.singletonPattern;

public class SingleObject {
	private static SingleObject instance =new SingleObject();
	
	//构造函数
	private SingleObject() {};
	
	public static SingleObject getInstance() {
		return instance;
	}
	public  void showMessage() {
		System.out.println("Hello World!");
	}

}
