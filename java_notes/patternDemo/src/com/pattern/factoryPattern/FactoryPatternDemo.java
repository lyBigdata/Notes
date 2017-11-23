package com.pattern.factoryPattern;
/**
 * 创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式
 * 工厂模式
 * @author ljg
 *
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape  shape1=  shapeFactory.getShape("CIRCLE");
		shape1.draw();
		Shape  shape2=  shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		Shape  shape3=  shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		
		
		
	}

}
