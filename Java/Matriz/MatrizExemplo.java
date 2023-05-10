package Matriz;

import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.Elements.Origin;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // gerar, preencher, imprimir e manipular matrizes
        // matriz10x9
        int matriz[][] = new int[10][9];// bidimensional 10x9
        // preencher matriz
        for (int i = 0; i < matriz.length; i++) {// 1ª dimensão
            for (int j = 0; j < 9; j++) {// 2ª dimensão
                // System.out.println("matriz[" + i + "][" + j + "]=");
                matriz[i][j] = rd.nextInt(10);

            }

        }
        // imprimir elemento a elemento da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "]="
                        + matriz[i][j]);
            }
        }
        // imprimir em linha x coluna
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        // somar todos os elementos da 4 linha
        int somaLinha = 0;
        for (int i = 0; i < 9; i++) {
            somaLinha += matriz[3][i];
        }
        System.out.println("++++++++++++++++");
        System.out.println(" A soma da Linha 4 é " + somaLinha);
        // somar todos os elementos da 4ª coluna
        somaLinha = 0;
        for (int i = 0; i < 10; i++) {
            somaLinha += matriz[i][3];
        }
        System.out.println("++++++++++++++++");
        System.out.println(" A soma da Linha 4 é " + somaLinha);
    }

    public void exercicioMatrizes1() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {// 1ª dimensão
            for (int j = 0; j < 5; j++) {// 2ª dimensão
                matriz[i][j] = 0;
                if (i == j) {
                    matriz[i][j] = 1;
                }
                System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j]);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

    }

    public void exercicioMatrizes2() {
        // 4x4
        // matriz e matriz transposta
        int matriz[][] = new int[4][4];
        int somaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {// 1ª dimensão
            for (int j = 0; j < 4; j++) {// 2ª dimensão
                matriz[i][j] = rd.nextInt(4);
                // System.out.println("matriz[" + i + "][" + j + "]="+matriz[i][j]);
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
                // System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j]);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println(somaDiagonal);
        System.out.println("++++++++++++++++++++");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicioExtra1() {
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {// 1ª dimensão
            for (int j = 0; j < 4; j++) {// 2ª dimensão
                matriz[i][j] = i * j;
                System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j]);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }
    public void exercicioExtra2() {
        
    }
}
