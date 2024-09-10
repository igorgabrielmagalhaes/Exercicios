package com.exercicio.dowhile;

import java.util.Locale;
import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int password;
		int loginPassword = 2002;
		
		do {
			password = input.nextInt();
			if(password != 2002){
				System.out.println("Senha Invalida!");
			}
			
		}while(password != loginPassword);
		
		System.out.println("Acesso Permitido");
		
		input.close();
	}

}
