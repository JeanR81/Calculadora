package Calculadora;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        boolean i = false;
        while (!i) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("---CALCULADORA---\n-----------------\nSelecione a Operação:\nDigite 1 para SOMA\nDigite 2 para SUBTRAÇÃO\nDigite 3 para MULTIPLICAÇÃO\nDigite 4 para DIVISÃO\nDigite 5 para LISTAR OPERAÇÔES\nDigite 6 para SAIR");
                int opcaoEscolhida = entrada.nextInt();

                if (opcaoEscolhida == 1) {
                    System.out.println("SOMA\nDigite o 1º número:");
                    try {
                        Double numeroA = entrada.nextDouble();
                        System.out.println("Digite o 2º número:");
                        Double numeroB = entrada.nextDouble();
                        Soma soma = new Soma(numeroA, numeroB);
                        calculadora.executaOperacao(soma);
                        System.out.println("Sua operação fica: " + soma + "\n");
                    } catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números");
                    }

                } else if (opcaoEscolhida == 2) {
                    System.out.println("SUBTRAÇÃO\nDigite o 1º número:");
                    try {
                        Double numeroA = entrada.nextDouble();
                        System.out.println("Digite o 2º número:");
                        Double numeroB = entrada.nextDouble();
                        Subtracao subtracao = new Subtracao(numeroA, numeroB);
                        calculadora.executaOperacao(subtracao);
                        System.out.println("Sua operação fica: " + subtracao + "\n");
                    } catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números");
                    }

                } else if (opcaoEscolhida == 3) {
                    System.out.println("MULTIPLICAÇÃO\nDigite o 1º número:");
                    try {
                        Double numeroA = entrada.nextDouble();
                        System.out.println("Digite o 2º número:");
                        Double numeroB = entrada.nextDouble();
                        Multiplicacao multiplicacao = new Multiplicacao(numeroA, numeroB);
                        calculadora.executaOperacao(multiplicacao);
                        System.out.println("Sua operação fica: " + multiplicacao + "\n");
                    } catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números");
                    }

                } else if (opcaoEscolhida == 4) {
                    System.out.println("DIVISÃO\nDigite o 1º número:");
                    try {
                        Double numeroA = entrada.nextDouble();
                        System.out.println("Digite o 2º número:");
                        Double numeroB = entrada.nextDouble();
                        Divisao divisao = new Divisao(numeroA, numeroB);
                        calculadora.executaOperacao(divisao);
                        System.out.println("Sua operação fica: " + divisao + "\n");
                    } catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números");
                    }

                } else if (opcaoEscolhida == 5) {
                    System.out.println("As operações até o momento foram:");
                    List<Operacao> operacoes = calculadora.getOperacoes();
                    int x;
                    for (x = 0; x < operacoes.size(); x++) {
                        System.out.println(operacoes.get(x));
                    }

                } else if (opcaoEscolhida == 6) {
                    System.out.println("Até mais!");
                    System.exit(0);

                } else {
                    System.out.println("Por favor, escolha uma opção válida.\n");
                }

            } catch (InputMismatchException exception) {
                System.out.println("Digite apenas números");
        }
    }
}
}





