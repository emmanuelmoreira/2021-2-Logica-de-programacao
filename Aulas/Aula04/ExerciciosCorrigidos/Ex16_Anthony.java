package Aulas.Aula04.ExerciciosCorrigidos;

import java.util.Scanner;

public class Ex16_Anthony {
    public static void main(String[] args) {


            Scanner leia = new Scanner(System.in);
            int DiasANo=365;    int DiasMes=30;
            int Anos;
            int Meses;
            int Dias;
            int ValorDias;

            System.out.println("Digite sua idade em anos: ");
            Anos=leia.nextInt();
            System.out.println("Digite quantos meses: ");
            Meses=leia.nextInt();
            System.out.println("Digite quantos dias: ");
            Dias=leia.nextInt();
            ValorDias=Dias+((Anos*DiasANo)+(Meses*DiasMes));
            System.out.println("Sua idade em dias será: "+ValorDias);
    }
}
