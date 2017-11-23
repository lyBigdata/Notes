package com.pattern.singletonPattern;
/**
 * 创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式
 * 单列模式
 * @author ljg
 *
 */
public class SingleObjectDemo {

	public static void main(String[] args) {

		SingleObject object  =SingleObject.getInstance();
		object.showMessage();
	}

}
