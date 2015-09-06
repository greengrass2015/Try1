package com.yicai.dao;
import java.text.DecimalFormat;
import java.math.*;

//enum ComparisonType {同比, 环比} ;
public class CPIData{
	double overallCPI;
	double foodCPI;
	double cigaCPI;
	double clothesCPI;
	double deviceCPI;
	double healthcareCPI;
	double transportCPI;
	double entertainmentCPI;
	double housingCPI;
	
	String overallCPITrend;
	String foodCPITrend;
	String cigaCPITrend;
	String clothesCPITrend;
	String deviceCPITrend;
	String healthcareCPITrend;
	String transportCPITrend;
	String entertainmentCPITrend;
	String housingCPITrend;
	 //  need xxxx年xx月 format date 
	int month; 
	protected DecimalFormat df  = new DecimalFormat("###.0");
	//double variation;

	String trend;
	//ComparisonType comparisonType;
	String comparisonType;
	
	String overallCPIName = "CPI";
	String foodCPIName = "食品";
	String cigaCPIName = "烟酒及用品";
	String clothesCPIName = "衣着";
	String deviceCPIName = "家庭设备用品及维修";
	String healthcareCPIName = "医疗保健和个人用品";
	String transportCPIName = "交通和通讯类";
	String entertainmentCPIName = "娱乐教育文化用品品及服务类";
	String housingCPIName = "居住类居民消费";
	
	public CPIData( ){
		
	}
	public CPIData(double overallCPI, double foodCPI, 
	double cigaCPI, double clothesCPI, double deviceCPI,
	double healthcareCPI,double transportCPI,double entertainmentCPI,
	double housingCPI, int month, String comparisonType){
	this.overallCPI = overallCPI;
	this.foodCPI = foodCPI;
	this.cigaCPI = cigaCPI;
	this.clothesCPI = clothesCPI;
	this.healthcareCPI = healthcareCPI;
	this.transportCPI = transportCPI;
	this.entertainmentCPI = entertainmentCPI;
	this.housingCPI = housingCPI;
	this.month = month;
	this.comparisonType = comparisonType;
	
	/*setOverallCPITrend(this.overallCPI); */
	}
	
	public int getMonth( ){
		return this.month;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	public double getOverallCPI(){
		return this.overallCPI;
	}
	public void setOverallCPI(double overallCPI){
		this.overallCPI = overallCPI;
	}
	public double getFoodCPI(){
		return this.foodCPI;
	}
	public void setFoodCPI(double foodCPI){
		this.foodCPI = foodCPI;
	}
	public double getCigaCPI(){
		return this.cigaCPI;
	}
	public void setCigaCPI(double cigaCPI){
		this.cigaCPI = cigaCPI;
	}
	public double getClothesCPI(){
		return this.clothesCPI;
	}
	public void setClothesCPI(double clothesCPI){
		this.clothesCPI = clothesCPI;
	}
	public double getDeviceCPI(){
		return this.deviceCPI;
	}
	public void setDeviceCPI(double deviceCPI){
		this.deviceCPI = deviceCPI;
	}
	public double getHealthcareCPI(){
		return this.healthcareCPI;
	}
	public void setHealthcareCPI(double healthcareCPI){
		this.healthcareCPI = healthcareCPI;
	}
	public double getTransportCPI(){
		return this.transportCPI;
	}
	public void setTransportCPI(double transportCPI){
		this.transportCPI = transportCPI;
	}
	public double getEntertainmentCPI(){
		return this.entertainmentCPI;
	}
	public void setEntertainmentCPI(double entertainmentCPI){
		this.entertainmentCPI = entertainmentCPI;
	}
	public double getHousingCPI(){
		return this.housingCPI;
	}
	public void setHousingCPI(double housingCPI){
		this.housingCPI = housingCPI;
	}
	
	
	public String getOverallCPIName(){
		return this.overallCPIName ;
	}
	
	public String getFoodCPIName( ){
		return this.foodCPIName;
	}
	public String getCigaCPIName( ){
		return this.cigaCPIName;
	}
	public String getClothesCPIName( ){
		return this.clothesCPIName;
	}
	public String getDeviceCPIName( ){
		return this.deviceCPIName;
	}
	public String getHealthcareCPIName( ){
		return this.healthcareCPIName;
	}

	public String getTransportCPIName( ){
		return this.transportCPIName;
	}
	public String getEntertainmentCPIName( ){
		return this.entertainmentCPIName;
	}
	public String getHousingCPIName( ){
		return this.housingCPIName;
	}

	/*public void setComparisonType(ComparisonType comparisonType){
		this.comparisonType = comparisonType;
	}
	public ComparisonType getComparisonType( ){
		return this.comparisonType;
	}*/
	public void setComparisonType(String comparisonType){
		if(comparisonType == "环比 " || comparisonType == "同比"){
			this.comparisonType = comparisonType;
		}else{
			System.out.println("输入补正确，请输入 环比 或 同比");
		}
	}
	
	public String getComparisonType( ){
		return this.comparisonType;
	}
	
	public String getOverallCPITrend( ){
		
		return this.overallCPITrend;
	}
	
	/*public void setOverallCPITrend(double percentage){
		
		if (percentage > 100){

			this.overallCPITrend = "增加";
		} else if(percentage < 100){
			this.overallCPITrend = "减少";	
		} else{
			this.overallCPITrend = "持平";
		}
	}
	public void setFoodCPITrend(String trend){

		this.foodCPITrend = trend;
	}
	public void setCigaCPITrend(String trend){
		this.cigaCPITrend = trend;
	}

	public void setCothesCPITrend(String trend){

		this.clothesCPITrend = trend;
	}
	public void setDeviceCPITrend(String trend){

		this.deviceCPITrend = trend;
	}
	public void setHealthcareCPITrend(String trend){

		this.healthcareCPITrend = trend;
	}
	public void setTransportCPITrend(String trend){

		this.transportCPITrend = trend;
	}
	public void setEntertainmentCPITrend(String trend){

		this.entertainmentCPITrend = trend;
	}
	public void setHousingCPITrend(String trend){

		this.housingCPITrend = trend;
	}*/
}
/*
class Common{
	protected double percentageValue;
	protected String name;
	protected String comparisonType;
	protected String trend;
	protected DecimalFormat df  = new DecimalFormat("###.0");
	public Common(){
		
	}
	public Common(double percentage, String comparisonType){
	//	setValue(percentage);
	//	setComparisonType(comparisonType);
		this.percentageValue = percentage;
		this.comparisonType = comparisonType;
	}
	public void setValue(double percentage){
		this.percentageValue = percentage;
	}
	public double getValue(){
		return this.percentageValue;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(String name){
		return this.name;
	}
	public void setComparisonType(String comparisonType){
		this.comparisonType = comparisonType;
	}
	public String getComparisonType(double comparisonType){
		return this.comparisonType;
	}
	public void setTrend(double percentage){
		if (percentage > 100){
			this.trend = "增加 " + df.format(Math.abs(percentage-100))+"%";
		}else if(percentage == 100){
			this.trend = "持平";
		}else{
			this.trend = "下降 " + df.format(Math.abs(percentage-100))+"%";
		}
		
	}
	public String getTrend(double percentage){
		return this.trend;
	}
	
}
class OverallCPI extends Common{
	String name = "CPI";
	/*public void setName(String name){
		this.name = name;
	}
	public String getName(String name){
		super.getName(name);
		return this.name;
	}
	
}*/