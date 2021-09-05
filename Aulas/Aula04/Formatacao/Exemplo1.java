package Aulas.Aula04.Formatacao;

import java.text.DecimalFormat;

public class Exemplo1 {
    public static void main(String[] args) {

    double peso = 180.4578945465;
    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println(df.format(peso));

    }

}
