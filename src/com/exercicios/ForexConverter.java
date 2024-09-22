package com.exercicios;

import java.util.Locale;
import java.util.Scanner;

import com.operacoes.CurrencyConverter;

public class ForexConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		CurrencyConverter convertCurrencies = new CurrencyConverter();
		
		System.out.println("What is the dollar price?");
		convertCurrencies.dollarPrice = input.nextDouble();
		
		System.out.println("How many dollars will be purchased?");
		convertCurrencies.dollarsToBuy = input.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", convertCurrencies.calculateIof(convertCurrencies.dollarPrice, convertCurrencies.dollarsToBuy));
		
		
		input.close();
	}

}
