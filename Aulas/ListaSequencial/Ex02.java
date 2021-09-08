/*
02 – Elaborar um programa que leia três valores do tipo inteiro (A, B e C) e apresente
como resultado final o quadrado da soma dos três valores lidos.
 */
package Aulas.ListaSequencial;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor1, valor2, valor3, soma;
        double quadrado;

        System.out.println("Digite o primeiro número");
        valor1 = leia.nextInt();

        System.out.println("Digite o segundo número");
        valor2 = leia.nextInt();

        System.out.println("Digite o terceiro número");
        valor3 = leia.nextInt();

        soma = valor1 + valor2 + valor3;
        quadrado = Math.pow(soma, 2);

        System.out.println("Valor 1  : " + valor1);
        System.out.println("Valor 2  : " + valor2);
        System.out.println("Valor 3  : " + valor3);
        System.out.println("Soma     : " + soma);
        System.out.println("Quadrado : " + quadrado);
    }
}