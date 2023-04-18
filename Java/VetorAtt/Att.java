package VetorAtt;

import java.util.Scanner;

public class Att {
    Scanner sc = new Scanner(System.in);

    public void primeira() {
        int[] vetorA = new int[] { 5, 10, 15, 20, 25 };
        int[] vetorB = new int[5];
        vetorB[0] = vetorA[0];
        vetorB[1] = vetorA[1];
        vetorB[2] = vetorA[2];
        vetorB[3] = vetorA[3];
        vetorB[4] = vetorA[4];
        System.out.println("o vetorB é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
    }

    public void segunda() {
        int[] vetorA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] vetorB = new int[] { vetorA[0] * 2, vetorA[1] * 2, vetorA[2] * 2, vetorA[3] * 2, vetorA[4] * 2,
                vetorA[5] * 2, vetorA[6] * 2, vetorA[7] * 2 };
        System.out.println("vetorB é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
    }

    public void terceira() {
        int[] vetorA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] vetorB = new int[] { vetorA[0] * vetorA[0], vetorA[1] * vetorA[1], vetorA[2] * vetorA[2],
                vetorA[3] * vetorA[3], vetorA[4] * vetorA[4], vetorA[5] * vetorA[5], vetorA[6] * vetorA[6],
                vetorA[7] * vetorA[7], vetorA[8] * vetorA[8], vetorA[9] * vetorA[9], vetorA[10] * vetorA[10],
                vetorA[11] * vetorA[11], vetorA[12] * vetorA[12], vetorA[13] * vetorA[13], vetorA[14] * vetorA[14] };
        System.out.println("vetorB é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
        System.out.println(vetorB[8]);
        System.out.println(vetorB[9]);
        System.out.println(vetorB[10]);
        System.out.println(vetorB[11]);
        System.out.println(vetorB[12]);
        System.out.println(vetorB[13]);
        System.out.println(vetorB[14]);
    }

    public void quarta() {
        int[] vetorA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        double[] vetorB = new double[] { Math.sqrt(vetorA[0]), Math.sqrt(vetorA[1]), Math.sqrt(vetorA[2]),
                Math.sqrt(vetorA[3]), Math.sqrt(vetorA[4]), Math.sqrt(vetorA[5]), Math.sqrt(vetorA[6]),
                Math.sqrt(vetorA[7]), Math.sqrt(vetorA[8]), Math.sqrt(vetorA[9]), Math.sqrt(vetorA[10]),
                Math.sqrt(vetorA[11]), Math.sqrt(vetorA[12]), Math.sqrt(vetorA[13]), Math.sqrt(vetorA[14]) };
        System.out.println("vetorB é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
        System.out.println(vetorB[8]);
        System.out.println(vetorB[9]);
        System.out.println(vetorB[10]);
        System.out.println(vetorB[11]);
        System.out.println(vetorB[12]);
        System.out.println(vetorB[13]);
        System.out.println(vetorB[14]);
    }

    public void quinta() {
        int[] vetorA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] vetorB = new int[] { vetorA[0] * 0, vetorA[1] * 1, vetorA[2] * 2, vetorA[3] * 3, vetorA[4] * 4,
                vetorA[5] * 5, vetorA[6] * 6, vetorA[7] * 7, vetorA[8] * 8, vetorA[9] * 9 };
        System.out.println("vetorB é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
        System.out.println(vetorB[8]);
        System.out.println(vetorB[9]);
    }

    public void seis() {
        int[] vetorA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] vetorB = new int[] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[] vetorC = new int[] { vetorA[0] + vetorB[0], vetorA[1] + vetorB[1], vetorA[2] + vetorB[2],
                vetorA[3] + vetorB[3], vetorA[4] + vetorB[4], vetorA[5] + vetorB[5], vetorA[6] + vetorB[6],
                vetorA[7] + vetorB[7], vetorA[8] + vetorB[8], vetorA[9] + vetorB[9] };
        System.out.println("vetorC é");
        System.out.println(vetorC[0]);
        System.out.println(vetorC[1]);
        System.out.println(vetorC[2]);
        System.out.println(vetorC[3]);
        System.out.println(vetorC[4]);
        System.out.println(vetorC[5]);
        System.out.println(vetorC[6]);
        System.out.println(vetorC[7]);
        System.out.println(vetorC[8]);
        System.out.println(vetorC[9]);
    }
}
