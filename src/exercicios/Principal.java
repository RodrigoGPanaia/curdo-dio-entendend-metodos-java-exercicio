package exercicios;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero1, numero2;

        System.out.print("Digite o primeiro valor: ");
        numero1 = scan.nextDouble();
        System.out.print("Digite o segundo valor: ");
        numero2 = scan.nextDouble();

        System.out.println();

        System.out.println("Exercício calculadora");

        double somar = Calculadora.somar(numero1, numero2);
        double subtrair = Calculadora.subtrair(numero1, numero2);
        double multiplicar = Calculadora.multiplicar(numero1, numero2);
        double dividir = Calculadora.dividir(numero1, numero2);


        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + somar);
        System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é " + subtrair);
        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + multiplicar);
        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + dividir);

        System.out.println();

        int hora;
        System.out.println("Exercício mensagem" );
        System.out.print("Digite a hora do dia: ");
        hora = scan.nextInt();

        Mensagem.obterMensagem(hora);

        System.out.println();

        double valor;
        System.out.println("Exercício empréstimo");
        System.out.print("Digite o valor desejado R$ ");
        valor = scan.nextDouble();

        Emprestimo.calcular((valor), Emprestimo.getDuasParcelas());
        Emprestimo.calcular((valor), Emprestimo.getTresParcelas());
        Emprestimo.calcular((valor), Emprestimo.getQuatroParcelas());
        Emprestimo.calcular((valor), Emprestimo.getCincoParcelas());
        Emprestimo.calcular((valor), Emprestimo.getSeisParcelas());
        Emprestimo.calcular((valor), 5);

    }

}
