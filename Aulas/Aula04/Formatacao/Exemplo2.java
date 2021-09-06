package Aulas.Aula04.Formatacao;

public class Exemplo2 {
    public static void main(String[] args) {
        double peso = 180.4578945465;

        String resultado = String.format("%.2f", peso);

        System.out.println(resultado);
    }
}
