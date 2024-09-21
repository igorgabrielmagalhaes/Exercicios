package com.exercicios;

import java.util.Locale;
import java.util.Scanner;

import com.operacoes.RetangleUtils;



public class Rectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		RetangleUtils rectangle = new RetangleUtils();
		
		System.out.println("Digite o valor da largura: ");
		rectangle.height = input.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		rectangle.width = input.nextDouble();
		
		System.out.printf("Área = %.2f%n", rectangle.area());
		System.out.printf("Perimetro %.2f%n", rectangle.perimetro());
		System.out.printf("Diagonal %.2f%n", rectangle.diagonal());
			input.close();

	}

}
