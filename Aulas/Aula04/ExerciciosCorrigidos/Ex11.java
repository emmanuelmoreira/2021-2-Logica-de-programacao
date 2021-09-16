package Aulas.Aula04.ExerciciosCorrigidos;

import java.util.Scanner;

/*
11 – Faça um programa que leia o Nome,
Valor Hora e Total de Horas Trabalhadas de um
        funcionário. Calcule e exiba:
        O salário bruto
        O valor doVale Transporte (6% do Salário Bruto)
        O desconto de Imposto de Renda (11% do Salário Bruto)
        O salário líquido.

 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        double valor_hora, horas_trabalhadas, salario_bruto, VT, IRPF, salario_liquido;

        System.out.println("Digite o nome :");
        nome = leia.nextLine();

        System.out.println("Digite o valor hora:");
        valor_hora = leia.nextDouble();

        System.out.println("DIgite o total de horas trabalhadas");
        horas_trabalhadas = leia.nextDouble();


        salario_bruto = valor_hora*horas_trabalhadas;
        VT = salario_bruto*0.06;
        IRPF = salario_bruto*0.11;

        salario_liquido = salario_bruto - (VT + IRPF);

        System.out.println(nome);
        System.out.println(salario_liquido);

    }
}
