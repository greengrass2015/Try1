package com.yicai.dao;

import java.text.DecimalFormat;

public class PPIData {
	double PPI;
/*	double manufactPPI;
	double consumpPPI;
	public CPIData(double PPI, double manufactPPI, 
	double consumpPPI){
	this.PPI = PPI;
	this.manufactPPI = manufactPPI;
	this.consumpCPI = consumpCPI;
	}*/
	DecimalFormat df  = new DecimalFormat("###.0");
	public double getPPI(){
		return this.PPI;
	}
	public void setPPI(double PPI){
		this.PPI = PPI;
	}
	/*
	public double getmanufactPPI(){
		return this.manufactPPI;
	}
	public void setmanufactPPI(double manufactPPI){
		this.manufactPPI = manufactPPI;
	}
	public double getconsumpPPI(){
		return this.consumpPPI;
	}
	public void setconsumpPPI(double consumpPPI){
		this.consumpPPI = consumpPPI;
	}
*/
	public String absValue(double db){
		return df.format(Math.abs(db));
	}

}
