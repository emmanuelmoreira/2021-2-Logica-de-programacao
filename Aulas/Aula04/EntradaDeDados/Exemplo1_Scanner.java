package Aulas.Aula04.EntradaDeDados;

import java.util.Scanner;

public class Exemplo1_Scanner {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;
        double peso;
        String nome;

        System.out.println("Digite seu nome: ");
        nome=leia.nextLine();

        System.out.println("Digite sua idade: ");
        idade=leia.nextInt();

        System.out.println("Digite seu peso: ");
        peso=leia.nextDouble();

        System.out.println("Nome: " + nome );
        System.out.println("Idade " + idade );
        System.out.println("Peso: " + peso);


    }
}
