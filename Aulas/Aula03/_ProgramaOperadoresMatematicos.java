package Aulas.Aula03;

public class _ProgramaOperadoresMatematicos {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double media;

        nota1 = 7;
        nota2 = 8;
        media = (nota1+nota2)/2;

        System.out.println("Soma:" + (nota1 + nota2));
        System.out.println("Subtração:" + (nota1 - nota2));
        System.out.println("Multiplicação:" + (nota1 * nota2));
        System.out.println("Divisão:" + (nota1 / nota2));
        System.out.println("Resto:" + (nota1 % nota2));
        System.out.println("Media:" + media);
        //Incremento e decremento
        nota1++;
        nota2--;
        System.out.println("Incremento:"+ nota1);
        System.out.println("Decremento:"+ nota2);


    }
}
