package com.pattern.abstractFactoryPattern;
/**
 * 创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式
 * 抽象工厂模式
 * @author ljg
 *
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory =FactoryProducer.getFactory("SHAPE");
		Shape	shape1=shapeFactory.getShape("CIRCLE");
		shape1.draw();
		Shape	shape2=shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		Shape	shape3=shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		AbstractFactory colorFactory=FactoryProducer.getFactory("COLOR");
		
		Color color1=colorFactory.getColor("RED");
		color1.fill();
		Color color2=colorFactory.getColor("GREEN");
		color2.fill();
		Color color3=colorFactory.getColor("BLUE");
		color3.fill();
		
		
	}

}
