package exercicios;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero1, numero2;

        System.out.println("Exercício calculadora");

        System.out.print("Digite o primeiro valor: ");
        numero1 = scan.nextDouble();
        System.out.print("Digite o segundo valor: ");
        numero2 = scan.nextDouble();

        Calculadora.somar(numero1, numero2);
        Calculadora.subtrair(numero1, numero2);
        Calculadora.multiplicar(numero1, numero2);
        Calculadora.dividir(numero1, numero2);

        System.out.println("___________________________________________________________________________________");
        System.out.println();

//        ------------------------------------------------------------------------------------

        System.out.println("Exercício mensagem" );
        int hora;
        System.out.print("Digite a hora do dia: ");
        hora = scan.nextInt();

        Mensagem.obterMensagem(hora);

        System.out.println("___________________________________________________________________________________");
        System.out.println();

//        ------------------------------------------------------------------------------------

        System.out.println("Exercício empréstimo");
        double valor;
        System.out.print("Digite o valor desejado R$ ");
        valor = scan.nextDouble();

        Emprestimo.calcular((valor), Emprestimo.getDuasParcelas());
        Emprestimo.calcular((valor), Emprestimo.getTresParcelas());
        Emprestimo.calcular((valor), Emprestimo.getQuatroParcelas());
        Emprestimo.calcular((valor), Emprestimo.getCincoParcelas());
        Emprestimo.calcular((valor), Emprestimo.getSeisParcelas());

        System.out.println("___________________________________________________________________________________");
        System.out.println();

    }

}
