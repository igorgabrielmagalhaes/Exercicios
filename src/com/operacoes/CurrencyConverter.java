package com.operacoes;

public class CurrencyConverter {
	public double dollarPrice;
	public double dollarsToBuy;	

	
	public double calculateIof(double amountInReais, double iof) {
		 amountInReais = dollarPrice * dollarsToBuy;
		 iof = 0.06 * amountInReais;
		return iof + amountInReais; 
	}
	
}
