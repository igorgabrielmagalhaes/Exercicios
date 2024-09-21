package com.operacoes;

public class RetangleUtils {
	public double height;
	public double width;
	
	public double area() {
		return this.height * this.width;
	}
	
	public double perimetro(){
		return 2 * (this.width + this.height);
	}
	
	public double diagonal(){
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
	}
}
