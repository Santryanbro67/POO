package Prova;

import java.util.Random;
import java.util.Scanner;

public class Prova {
    Scanner sc = new Scanner(System.in);

    public void atividade1() {
        System.out.println("Insira o Primeiro Número Decimal");
        double primeiroNumero = sc.nextDouble();
        System.out.println("Insira o Segundo Número Decimal");
        double segundoNumero = sc.nextDouble();
        System.out.println("Agora Selecione a Operação com 1-Adição 2-Subtração 3-Multiplicação 4-Divisão");
        int operacao = sc.nextInt();
        double resposta;
        if (operacao == 1) {
            resposta = primeiroNumero + segundoNumero;
            System.out.println("O Resultado da Operação é " + resposta);
        } else if (operacao == 2) {
            resposta = primeiroNumero - segundoNumero;
            System.out.println("O Resultado da Operação é " + resposta);
        } else if (operacao == 3) {
            resposta = primeiroNumero * segundoNumero;
            System.out.println("O Resultado da Operação é " + resposta);
        } else if (operacao == 4) {
            resposta = primeiroNumero / segundoNumero;
            System.out.println("O Resultado da Operação é " + resposta);
        } else {
            System.out.println("Opção de Operação Inexistente");
        }
    }

    public void atividade2() {
        System.out.println("Digite o Seu Número de Matrícula Para Saber de Qual Time Você Será");
        int numeroMatricula = sc.nextInt();
        Random rd = new Random();
        int nSorteado = rd.nextInt(3);
        if (nSorteado == 0) {
            System.out.println("Você caiu no time do Chris");
        } else if (nSorteado == 1) {
            System.out.println("Você caiu no time do Caruso");
        } else if (nSorteado == 2) {
            System.out.println("Você caiu no time do Greg");
        } else if (nSorteado == 3) {
            System.out.println("Você caiu no time do Jerome");
        }
    }

    public void atividade3() {
        System.out.println("Quantos quilos de Morango você comprou");
        double kiloMorango = sc.nextDouble();
        double precoMorango = kiloMorango * 2.5;
        System.out.println("Quantos quilos de Maçã você comprou");
        double kiloMacas = sc.nextDouble();
        double precoMacas = kiloMacas * 1.8;
        System.out.println("Quantos quilos de Banana você comprou");
        double kiloBananas = sc.nextDouble();
        double precoBananas = kiloBananas * 1.3;
        double valorGasto = precoMorango + precoMacas + precoBananas;
        double valorPagar;
        if (kiloMorango + kiloMacas + kiloBananas > 8 || valorGasto > 25) {
            valorPagar = valorGasto - (valorGasto * 10 / 100);
            System.out.println("Você Deve Pagar R$ " + valorPagar);
        } else {
            valorPagar = valorGasto;
            System.out.println("Você Deve Pagar R$ " + valorPagar);
        }
    }
}
