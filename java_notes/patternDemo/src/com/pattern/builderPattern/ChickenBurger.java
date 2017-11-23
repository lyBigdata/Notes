package com.pattern.builderPattern;

public abstract class ChickenBurger extends Burger {

	 @Override
	   public float price() {
	      return 50.5f;
	   }

	   @Override
	   public String name() {
	      return "Chicken Burger";
	   }
}
