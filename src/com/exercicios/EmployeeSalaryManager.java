package com.exercicios;

import java.util.Locale;
import java.util.Scanner;

import com.operacoes.SalaryOperations;

public class EmployeeSalaryManager {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SalaryOperations employee = new SalaryOperations();
		
		System.out.println("Name: ");
		employee.nome = input.next();
		System.out.println("Gross Salary: ");
		employee.salarioBruto = input.nextDouble();
		System.out.println("Tax: ");
		employee.taxa = input.nextDouble();
		
		System.out.println();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary? ");
		double porcentagem = input.nextDouble();
		
		employee.increaseSalary(porcentagem);
		System.out.println();
		
		System.out.println("Update Data: " + employee);
		
		
		
			input.close();
	}

}
