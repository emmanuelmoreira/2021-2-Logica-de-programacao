package Aulas.Aula04.EntradaDeDados;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exemplo2_BufferedReader {
    public static void main(String[] args) {
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        int idade;
        double peso;
        String nome;
        try {
            System.out.println("Digite seu nome: ");
            nome = leia.readLine();
            System.out.println("Digite sua idade: ");
            idade=Integer.parseInt(leia.readLine());
            System.out.println("Digite seu peso: ");
            peso = Double.parseDouble(leia.readLine());

            System.out.println("Nome: " + nome );
            System.out.println("Idade " + idade );
            System.out.println("Peso: " + peso);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
