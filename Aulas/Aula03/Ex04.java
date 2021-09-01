package Aulas.Aula03;

import java.util.Scanner;

/*
Faça um algoritmo que receba o peso de uma pessoa em Kg, e mostre:
        a) O novo peso se essa pessoa engordar 15%
        b) O novo peso se essa pessoa emagrecer 20%

 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double peso;

        System.out.println("Digite seu peso:");
        peso=leia.nextDouble();

        System.out.println("Peso atual: "+peso);
        System.out.println("Peso Engorde: "+ (peso+(peso*0.15)));
        System.out.println("Peso Emagrecer: "+ (peso-(peso*0.20)));





    }
}
