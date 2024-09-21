package com.operacoes;

public class SalaryOperations {
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double SalarioLiquido(){
		return  salarioBruto - taxa;		 
	}
	
	public double increaseSalary(double addition) {
		 return  this.salarioBruto += this.salarioBruto * (addition / 100);
		
	}
	
	public String toString(){
		return this.nome + " $ " + String.format("%.2f%n", SalarioLiquido());
	}
	
}
