package com.exercicios;

import java.util.Scanner;

public class ContadorCombustivel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ContadorCombustivel fuelMessage = new ContadorCombustivel();
		
		int[] fuel  = new int[3];
		
		System.out.println(fuelMessage.toString());
		int x =  input.nextInt();
		clearScreen();
		
		do{				
			switch(x){
			case 1:
				fuel[0]++;
				break;
			case 2:
				fuel[1]++;
				break;
			case 3:
				fuel[2]++;
				break;
			default:
				System.out.println("Valor invalido! Tente novamente.");
				break;
			}
			 System.out.println(fuelMessage.toString());
			 x = input.nextInt();
			 clearScreen();
		}while(x != 4);
		
		System.out.println("Muito Obrigado");
		System.out.println("Álcool " + fuel[0]);
		System.out.println("Gasolina " + fuel[1]);
		System.out.println("Diesel " + fuel[2]);
			input.close();
	}
	
	
	public String toString() {
		return "Digite o código do combustível:\n" +
		       "1 para Álcool\n" +
		       "2 para Gasolina\n" +
		       "3 para Diesel\n" +
		       "4 para sair:";
	}	
	
	// Simula limpeza da tela
	public static void clearScreen() {
	    for (int i = 0; i < 50; i++) {
	        System.out.println();
	    }
	}
		
}
