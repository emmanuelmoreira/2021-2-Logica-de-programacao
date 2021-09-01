package Aulas.Aula03;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;

        System.out.println("Digite o seu nome");
        nome=leia.nextLine();

        System.out.println("Nome digitado é:"+nome);

    }
}
