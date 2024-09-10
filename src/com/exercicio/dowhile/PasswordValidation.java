package com.exercicio.dowhile;

import java.util.Locale;
import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida.
        Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
        Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" 
        e o algoritmo encerrado. 
        Considere que a senha correta é o valor 2002.
        
        Entrada:      Saída:
        2200          Senha Invalida
        1020          Senha Invalida 
        2022          Senha Invalida
        2002          Acesso Permitido
        */
        
        int password;
        int loginPassword = 2002;
        
        do {
            password = input.nextInt();
            if (password != 2002) {
                System.out.println("Senha Invalida!");
            }
        } while (password != loginPassword);
        
        System.out.println("Acesso Permitido");
        
        input.close();
    }

}