package com.pattern.builderPattern;
/**
 *  创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式
 *  建造者模式
 * @author ljg
 *
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {
		  MealBuilder mealBuilder = new MealBuilder();

	      Meal vegMeal = mealBuilder.prepareVegMeal();
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " +vegMeal.getCost());

	      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.showItems();
	      System.out.println("Total Cost: " +nonVegMeal.getCost());
	}

}
