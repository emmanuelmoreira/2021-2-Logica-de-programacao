package Aulas.Aula04.ExerciciosCorrigidos;

import java.util.Scanner;

public class Ex16_Bruno {
    public static void main(String[] args) {

        int anos, meses, dias, total;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade");
        anos = s.nextInt();
        System.out.println("Qual mês você nasceu?");
        meses = s.nextInt();
        System.out.println("Qual dia você nasceu?");
        dias = s.nextInt();
        meses = 12 - meses;
        System.out.println("Você tem meses de vida" + meses);
        dias = 31 - dias;
        System.out.println("Você tem dias de vida:" + dias);
        total = (anos * 365) + (meses * 12) + (dias * 30);
        System.out.println("O total de dias de vida é: " + total);
    }
}


