package com.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class PontosCartesianos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
	
		
		 while (true) {
		int  x = input.nextInt();
		int  y = input.nextInt();
           
            // Verifica se o usuário quer sair
            if (x == 0 || y == 0) {
                break; // Sai do loop se x ou y forem zero
            }
           
            // Determina o quadrante
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");    
            }
        }
        
        input.close(); 
    }
}
