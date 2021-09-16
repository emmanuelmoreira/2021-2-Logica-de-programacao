/*
* – Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
* e mostre-a expressa apenas em dias.*/
package Aulas.Aula04.ExerciciosCorrigidos;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int anos;
        int meses;
        int dias;
        int total;

        Scanner leia = new Scanner(System.in);


        //Jeito 1
        System.out.println("Digite quantos anos vc tem");
        anos = leia.nextInt();

        System.out.println("Digite quanto meses vc tem");
        meses = leia.nextInt();

        System.out.println("Digite quanto dias vc tem");
        dias = leia.nextInt();

        total = (anos*365) + (meses*30)+dias;

        System.out.println(total);
    }
}
