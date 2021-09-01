package Aulas.Aula03;

import java.util.Scanner;

/*
Faça um algoritmo que leia dois valores inteiros. Logo após troque
os valores entre estas variáveis.

 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor1;
        int valor2;
        int aux;

        System.out.println("Digite o valor 1");
        valor1=leia.nextInt();//10

        System.out.println("Digite o valor 2");
        valor2=leia.nextInt();//20

        aux=valor1;
        valor1=valor2;
        valor2=aux;

        System.out.println("Valor1:"+valor1);
        System.out.println("Valor2:"+valor2);

    }
}
