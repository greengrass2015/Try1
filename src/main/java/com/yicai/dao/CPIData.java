package com.yicai.dao;
import java.text.DecimalFormat;
import java.math.*;

enum ComparisonType {ͬ��, ����} ;
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
	
	protected DecimalFormat df  = new DecimalFormat("###.0");
	

	String trend;
	ComparisonType comparisonType;
	
	String overallCPIName = "CPI";
	String foodCPIName = "ʳƷ";
	String cigaCPIName = "�̾Ƽ���Ʒ";
	String clothesCPIName = "����";
	String deviceCPIName = "��ͥ�豸��Ʒ��ά��";
	String healthcareCPIName = "ҽ�Ʊ����͸�����Ʒ";
	String transportCPIName = "��ͨ��ͨѶ��";
	String entertainmentCPIName = "���ֽ����Ļ���ƷƷ��������";
	String housingCPIName = "��ס���������";
	
	public CPIData( ){
		
	}
	public CPIData(double overallCPI, double foodCPI, 
	double cigaCPI, double clothesCPI, double deviceCPI,
	double healthcareCPI,double transportCPI,double entertainmentCPI,
	double housingCPI){
	this.overallCPI = overallCPI;
	this.foodCPI = foodCPI;
	this.cigaCPI = cigaCPI;
	this.clothesCPI = clothesCPI;
	this.healthcareCPI = healthcareCPI;
	this.transportCPI = transportCPI;
	this.entertainmentCPI = entertainmentCPI;
	this.housingCPI = housingCPI;
	}
	public double getoverallCPI(){
		return this.overallCPI;
	}
	public void setoverallCPI(double overallCPI){
		this.overallCPI = overallCPI;
	}
	public double getfoodCPI(){
		return this.foodCPI;
	}
	public void setfoodCPI(double foodCPI){
		this.foodCPI = foodCPI;
	}
	public double getcigaCPI(){
		return this.cigaCPI;
	}
	public void setcigaCPI(double cigaCPI){
		this.cigaCPI = cigaCPI;
	}
	public double getclothesCPI(){
		return this.clothesCPI;
	}
	public void setclothesCPI(double clothesCPI){
		this.clothesCPI = clothesCPI;
	}
	public double getdeviceCPI(){
		return this.deviceCPI;
	}
	public void setdeviceCPI(double deviceCPI){
		this.deviceCPI = deviceCPI;
	}
	public double gethealthcareCPI(){
		return this.healthcareCPI;
	}
	public void sethealthcareCPI(double healthcareCPI){
		this.healthcareCPI = healthcareCPI;
	}
	public double gettransportCPI(){
		return this.transportCPI;
	}
	public void settransportCPI(double transportCPI){
		this.transportCPI = transportCPI;
	}
	public double getentertainmentCPI(){
		return this.entertainmentCPI;
	}
	public void setentertainmentCPI(double entertainmentCPI){
		this.entertainmentCPI = entertainmentCPI;
	}
	public double gethousingCPI(){
		return this.housingCPI;
	}
	public void sethousingCPI(double housingCPI){
		this.housingCPI = housingCPI;
	}
	
	
/*	public void setOverallCPIName(String overallCPIName){
		this.overallCPIName = overallCPIName;
	}
	*/
	public String getoverallCPIName( ){
		return this.overallCPIName;
	}
	public void setComparisonType(ComparisonType comparisonType){
		this.comparisonType = comparisonType;
	}
	public ComparisonType getComparisonType( ){
		return this.comparisonType;
	}
	public void setTrend(double percentage){
		if (percentage > 100){
			this.trend = "���� " + df.format(Math.abs(percentage-100))+"%";
		}else if(percentage == 100){
			this.trend = "��ƽ";
		}else{
			this.trend = "�½� " + df.format(Math.abs(percentage-100))+"%";
		}
	}
	public String getTrend( ){
		return this.trend;
	}
	
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
			this.trend = "���� " + df.format(Math.abs(percentage-100))+"%";
		}else if(percentage == 100){
			this.trend = "��ƽ";
		}else{
			this.trend = "�½� " + df.format(Math.abs(percentage-100))+"%";
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