package com.operacoes;

public class NotaManager {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade(){
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public double remainingPoints(){
		if(finalGrade() < 60.00){
			return 60.00 - finalGrade();
		}else {
			return 0.0;
		}
	}
	
	
}