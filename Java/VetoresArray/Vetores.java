package VetoresArray;

import java.util.Scanner;

public class Vetores {
 Scanner sc = new Scanner(System.in);
 public void exemplo1() {
    //criando um vetor
    double[] valores = new double[]{10.5,20.7,30.6,40.4};
    System.out.println("1ª Posição - Índice[0]:"+valores[0]);
    System.out.println("2ª Posição - Índice[1]:"+valores[1]);
    System.out.println("3ª Posição - Índice[2]:"+valores[2]);
    System.out.println("4ª Posição - Índice[3]:"+valores[3]);
    //Mudando valores de uma posição definida
    valores[0] = 15.6; //Mudando valor do índice[0]
    System.out.println("1ª Posição - Índice[0]:"+valores[0]);
 } 
 public void exemplo2() {
    //criando um vetor
    int valoresInt[] = new int[5];
    System.out.println("Digite 5 Nº inteiros");
    valoresInt[0]=sc.nextInt();
    valoresInt[1]=sc.nextInt();
    valoresInt[2]=sc.nextInt();
    valoresInt[3]=sc.nextInt();
    valoresInt[4]=sc.nextInt();
    System.out.println("1ª posição - índice[0]:"+valoresInt[0]);
    System.out.println("2ª posição - índice[1]:"+valoresInt[1]);
    System.out.println("3ª posição - índice[2]:"+valoresInt[2]);
    System.out.println("4ª posição - índice[3]:"+valoresInt[3]);
    System.out.println("5ª posição - índice[4]:"+valoresInt[4]);
 }  
 public void exemplo3() {
    double valoresReais[] = new double[10];
    System.out.println("Digite 10 Nº reais");
    valoresReais[0]=sc.nextDouble();
    valoresReais[1]=sc.nextDouble();
    valoresReais[2]=sc.nextDouble();
    valoresReais[3]=sc.nextDouble();
    valoresReais[4]=sc.nextDouble();
    valoresReais[5]=sc.nextDouble();
    valoresReais[6]=sc.nextDouble();
    valoresReais[7]=sc.nextDouble();
    valoresReais[8]=sc.nextDouble();
    valoresReais[9]=sc.nextDouble();
    System.out.println("1ª posição - "+valoresReais[9]);
    System.out.println("2ª posição - "+valoresReais[8]);
    System.out.println("3ª posição - "+valoresReais[7]);
    System.out.println("4ª posição - "+valoresReais[6]);
    System.out.println("5ª posição - "+valoresReais[5]);
    System.out.println("6ª posição - "+valoresReais[4]);
    System.out.println("7ª posição - "+valoresReais[3]);
    System.out.println("8ª posição - "+valoresReais[2]);
    System.out.println("9ª posição - "+valoresReais[1]);
    System.out.println("10ª posição - "+valoresReais[0]);
 }
 public void exemplo4() {
    double notas[] = new double[4];
    System.out.println("Digite 4 Notas");
    notas[0]=sc.nextDouble();
    notas[1]=sc.nextDouble();
    notas[2]=sc.nextDouble();
    notas[3]=sc.nextDouble();
    double media = (notas[0] + notas[1] + notas[2] + notas[3])/4;
    System.out.println("Sua media é "+media);
 }
}
