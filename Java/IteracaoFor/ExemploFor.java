package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("o nº da iteração é " + i);
        }
    }

    public void exemplo2() {
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor[" + i + "]=");
            vetor[i] = sc.nextInt();
        }

        for (int i = 9; i >= vetor.length; i--) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }

    }

    public void exemplo3() {
        double carrinhoCompra[] = new double[] { 19.90, 35.70, 56.80, 97.50 };
        double valorFinal = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
            System.out.println("Valor Parcial Compra: R$" + valorFinal);
        }
        System.out.println("O valor da Compra é R$" + valorFinal);

    }

    public void exemplo4() {
        double vetorNotas[] = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            vetorNotas[i] = sc.nextDouble();
        }

        double mediaNotas = 0;

        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas += vetorNotas[i];
            System.out.println("A" + (i + 1) + "ª Nota é " + vetorNotas[i]);
        }

        mediaNotas /= vetorNotas.length;
        System.out.println("A média do aluno é %.2f" + mediaNotas);

    }

    public void exemplo5() {
        double vetorMedia[] = new double[5];
        for (int i = 0; i < vetorMedia.length; i++) {
            int notas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + " Aluno " + (i + 1) + ": ");
                notas += sc.nextDouble();
            }
            notas /= 4;
            vetorMedia[i] = notas;
        }
        for (int i = 0; i < vetorMedia.length; i++) {
            if (vetorMedia[i] >= 7) {
                System.out.println("A média do aluno " + (i + 1) + " é " + vetorMedia[i]);
            }

        }

    }

    public void exemplo6() {
        int vetor[] = new int[] { 1, 2, 3, 4, 5 };
        int valorFinal = 0;
        for (int i = 0; i < vetor.length; i++) {
            valorFinal += vetor[i];
            System.out.println("soma parcial é " + valorFinal);
        }
        System.out.println("Valor total da soma: " + valorFinal);
        valorFinal = 1;
        for (int i = 0; i < vetor.length; i++) {
            valorFinal *= vetor[i];
            System.out.println("multiplicação parcial é " + valorFinal);
        }
        System.out.println("Valor total da multiplicação: " + valorFinal);

    }

    public void exemplo7() {
        double alturaPessoas[] = new double[2];
        double pesoPessoas[] = new double[2];
        for (int i = 0; i < pesoPessoas.length; i++) {
            int pessoa = 0;
            for (int j = 0; j < 4; j++) {
                
            }
        }

    }

}
