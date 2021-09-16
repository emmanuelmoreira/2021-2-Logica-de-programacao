package Aulas.Aula04.ExerciciosCorrigidos;

import java.util.Scanner;

/*
 18 - O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
  percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
   Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
   escrever um algoritmo que leia o custo de fábrica de um carro e escreva o custo
   ao consumidor.


* */
public class Ex18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double custo_consumidor, custo_fabrica,perctDistribuidor, impostos;

        System.out.println("Digite o custo de fabrica ");
        custo_fabrica =leia.nextDouble();

        impostos = custo_fabrica*0.45;
        perctDistribuidor = custo_fabrica*0.28;

        custo_consumidor = custo_fabrica+impostos+perctDistribuidor;

        System.out.println("Preço consumidor: "+custo_consumidor);

        /*
        * custo fabrica = 100
        * imposto       =  45
        * %dist         = 28
        * */


    }
}
