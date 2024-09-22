package com.exercicios;

import java.util.Locale;
import java.util.Scanner;

import com.operacoes.NotaManager;

public class Student {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		NotaManager notaManager = new NotaManager();
		
		System.out.println("Name: ");
		notaManager.nome = input.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		notaManager.nota1 = input.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		notaManager.nota2 = input.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		notaManager.nota3 = input.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n",notaManager.finalGrade());
		
		if(notaManager.finalGrade() < 60.00) {		
		System.out.println("FAILED");
		System.out.printf("Missing: %.2f POINTS%n", notaManager.remainingPoints());
		}
		else {
			System.out.println("Passed");
		}
		
		
		input.close();
	}
}