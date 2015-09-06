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
	
	String overallfoodCPIName = "ʳƷ";
	String foodSuppliesCPIName = "��ʳ";
	String mealCPIName = "��";
	String eggCPIName = "��";
	String aquaticCPIName = "ˮ��";
	String vegetableCPIName = "�߲�";
	String fruitCPIName = "ˮ��";
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
