package Aulas.Aula04.EntradaDeDados;

import javax.swing.*;

public class Exemplo3_JoptionPane {
    public static void main(String[] args) {
        int idade;
        double peso;
        String nome;


        nome = JOptionPane.showInputDialog(("Digite o seu nome"));
        idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));

        JOptionPane.showMessageDialog(null, "nome: "+nome+"\n"+"idade: "+idade+"\n"+"peso: "+peso);

        System.exit(0);
    }
}
