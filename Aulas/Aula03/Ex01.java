package Aulas.Aula03;
/*
Elaborar um programa que leia três valores do tipo inteiro
(A, B e C) e apresente como resultado final o quadrado da soma
dos três valores lidos.
*/

public class Ex01 {
    public static void main(String[] args) {
        int valorA;
        int valorB;
        int valorC;
        int soma;
        int total;

        valorA = 2;
        valorB = 3;
        valorC = 4;

        soma = valorA+valorB+valorC;

        System.out.println("Soma:"+soma);
        System.out.println("Quadrado:"+Math.pow(soma,2));
    }
}
/*
* Math é uma classe do java que tem diversas funções matemáticas
* Math.pow(numero,2) =>numero ao quadrado
* Math.pow(numero,3) =>numero ao cubo
* Math.sqrt(numero)  =>raiz quadrada do numero
* */
