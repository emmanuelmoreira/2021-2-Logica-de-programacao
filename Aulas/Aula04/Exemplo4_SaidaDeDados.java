package Aulas.Aula04;


public class Exemplo4_SaidaDeDados {
    public static void main(String[] args) {
        String nome = "Emmanuel";
        int idade = 41;
        double peso = 90.554785;

        System.out.println(nome);
        System.out.print(Math.round(peso));
        System.out.printf("%s %d %2f", nome, idade, peso);
    }
}
