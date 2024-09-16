package com.exercicios;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		if(x >= 1 && x<= 1000) {			
		
			for(int i = 1; i <= x; i++) {
				if(i % 2 != 0){
					System.out.println(i);
				}
			}

		}else {
			System.out.println("O valor deve estar entre 1 e 1000.");
		}
			input.close();
	}
	
}