package com.yicai.dao;

import java.text.DecimalFormat;

public class PPIData {
	double overallPPI;
	double manufactPPI;
	double consumpPPI;
	
	int month;
	protected DecimalFormat df  = new DecimalFormat("###.0");
	double variation;

	String trend;
	//ComparisonType comparisonType;
	String comparisonType;
	String overallPPIName = "PPI";
	String manufactPPIName = "������������";
	String consumpPPIName = "������������";
	
	public PPIData(double PPI, double manufactPPI, 
	double consumpPPI, int month, String comparisonType){
	this.overallPPI = PPI;
	this.manufactPPI = manufactPPI;
	this.consumpPPI = consumpPPI;
	this.month = month;
	this.comparisonType = comparisonType;
	}
	
	public int getMonth( ){
		return this.month;
	}
	public String getComparisonType( ){
		return this.comparisonType;
	}
	
	public double getOverallPPI(){
		return this.overallPPI;
	}
	public void setOverallPPI(double overallPPI){
		this.overallPPI = overallPPI;
	}
	public double getManufactPPI(){
		return this.manufactPPI;
	}
	public void setManufactPPI(double manufactPPI){
		this.manufactPPI = manufactPPI;
	}
	public double getConsumpPPI(){
		return this.consumpPPI;
	}
	public void setConsumpPPI(double consumpPPI){
		this.consumpPPI = consumpPPI;
	}
	public String getOverallPPIName(){
		return this.overallPPIName;
	}
	public String getManufactPPIName(){
		return this.manufactPPIName;
	}
	public String getconsumpPPIName(){
		return this.consumpPPIName;
	}
	public void setComparisonType(String comparisonType){
		if(comparisonType == "���� " || comparisonType == "ͬ��"){
			this.comparisonType = comparisonType;
		}else{
			System.out.println("���벹��ȷ�������� ���� �� ͬ��");
		}
	}
	


}
