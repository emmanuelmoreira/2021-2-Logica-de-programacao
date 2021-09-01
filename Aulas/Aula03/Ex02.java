package Aulas.Aula03;

/*Ler um número inteiro e imprimir seu sucessor e seu antecessor

 */
public class Ex02 {
    public static void main(String[] args) {
        int numero;
        int antecessor;
        int sucessor;


        numero = 499;
        antecessor = numero-1;
        sucessor = numero+1;

        System.out.println("numero:"+numero);
        System.out.println("antecessor:"+antecessor);
        System.out.println("sucessor:"+sucessor);
    }
}
