/*
    01 – Faça um algoritmo que leia dois números e mostre:
    a) A soma dos dois números;
    b) A subtração dos dois números;
    c) A multiplicação dos dois números;
    d) A divisão do primeiro número pelo segundo;
    e) A raiz quadrada de cada um deles;
    f) O quadrado de cada um dos dois números;
    g) O primeiro elevado ao segundo número. Ou Seja, o primeiro é a base e o segundo o expoente.
*/
package Aulas.ListaSequencial;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int n1, n2, soma, subtracao, mult, divisao;
        double raiz1, raiz2, quadrado1, quadrado2, potencia;

        System.out.println("Digite o Primeiro número");
        n1 = leia.nextInt();

        System.out.println("Digite o Segundo número");
        n2 = leia.nextInt();

        soma = n1 + n2;
        subtracao = n1 - n2;
        mult = n1 * n2;
        divisao = n1 / n2;
        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);
        quadrado1 = Math.pow(n1, 2);
        quadrado2 = Math.pow(n2, 2);
        potencia = Math.pow(n1, n2);

        System.out.println("soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + divisao);
        System.out.println("raiz1: " + raiz1);
        System.out.println("raiz2: " + raiz2);
        System.out.println("quadrado1: " + quadrado1);
        System.out.println("quadrado2: : " + quadrado2);
        System.out.println("potência: " + potencia);
    }
}