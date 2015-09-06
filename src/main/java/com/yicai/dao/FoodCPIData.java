package com.yicai.dao;

import java.text.DecimalFormat;

public class FoodCPIData {
	double overallFoodCPI;
	double foodSuppliesCPI;
	double mealCPI;
	double eggCPI;
	double aquaticCPI;
	double vegetableCPI;
	double fruitCPI;
	
	int month;
	protected DecimalFormat df  = new DecimalFormat("###.0");
	double variation;

	String trend;
	//ComparisonType comparisonType;
	String comparisonType;
	
	String overallfoodCPIName = "食品";
	String foodSuppliesCPIName = "粮食";
	String mealCPIName = "肉";
	String eggCPIName = "蛋";
	String aquaticCPIName = "水产";
	String vegetableCPIName = "蔬菜";
	String fruitCPIName = "水果";
	public FoodCPIData(double overallFoodCPI, double foodSuppliesCPI,
			double mealCPI, double eggCPI, double aquaticCPI,
			double vegetableCPI, double fruitCPI, int month, String comparisonType){
		this.overallFoodCPI = overallFoodCPI;
		this.foodSuppliesCPI = foodSuppliesCPI;
		this.mealCPI = mealCPI;
		this.eggCPI = eggCPI;
		this.aquaticCPI = aquaticCPI;
		this.vegetableCPI = vegetableCPI;
		this.fruitCPI = fruitCPI;
		this.month = month;
		this.comparisonType = comparisonType;		
	}
	
	public int getMonth( ){
		return this.month;
	}
	
	public String getOverallfoodCPIName(){
		return this.overallfoodCPIName;
	}
	public String getFoodSuppliesCPIName(){
		return this.foodSuppliesCPIName;
	}
	public String getMealCPIName(){
		return this.mealCPIName;
	}
	public String getEggCPIName(){
		return this.eggCPIName;
	}
	public String getAquaticCPIName(){
		return this.aquaticCPIName;
	}
	public String getVegetableCPIName(){
		return this.vegetableCPIName;
	}
	public String getFruitCPIName(){
		return this.fruitCPIName;
	}
}
