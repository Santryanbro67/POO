package ExercícioIfElse;

import java.lang.reflect.Method;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Exercicios {

    Scanner sc = new Scanner(System.in);
     public void exercicio1() {
        System.out.println("Digite o primeiro valor");
        double primeiroValor = sc.nextDouble();
        System.out.println("Digite o segundo Valor");
        double segundoValor = sc.nextDouble();
        if (primeiroValor>segundoValor) {
            System.out.println("O Maior Valor é "+primeiroValor);
        } else if (primeiroValor<segundoValor){
            System.out.println("O Maior Valor é "+segundoValor);
        } else{
            System.out.println("Os valores são inguais");
        }
     }
     public void exercicio2() {
        System.out.println("Digite seu ano de nascimento");
        int anoNascimento = sc.nextInt();
        if (anoNascimento<=2007) {
            System.out.println("Esse ano você poderá votar");
        }else{
            System.out.println("Esse ano você ainda não poderá votar");
        }
     }
     public void exercicio3() {
        System.out.println("Digite a Senha");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        }else{
            System.out.println("ACESSO NEGADO");
        }
        
     }
     public void exercicio4() {
        System.out.println("Digite a quantia de maçãs compradas");
        int quantia = sc.nextInt();
        double valor = 0.30;
        if (quantia >= 12) {
            valor = 0.25;
        }
        double valorTotal = valor*quantia;
        System.out.println("O valor total da compra é R$"+valorTotal); 
     }
     public void exercicio5() {
        System.out.println("Digite o Primeiro Valor");
        int primeiroValor = sc.nextInt();
        System.out.println("Digite o Segundo Valor");
        int segundoValor = sc.nextInt();
        System.out.println("Digite o Terceiro Valor");
        int terceiroValor = sc.nextInt();
        if (primeiroValor<segundoValor && primeiroValor<terceiroValor) {
            System.out.println("Primeiro "+primeiroValor);
        } else if (segundoValor<primeiroValor && segundoValor<terceiroValor) {
        System.out.println("Primeiro "+segundoValor);
        }else if (terceiroValor<primeiroValor && terceiroValor<segundoValor) {
        System.out.println("Primeiro "+terceiroValor);
        }

        if (primeiroValor<segundoValor && primeiroValor>terceiroValor || primeiroValor>segundoValor && primeiroValor<terceiroValor) {
            System.out.println("Segundo "+primeiroValor);
        }else if (segundoValor<primeiroValor && segundoValor>terceiroValor || segundoValor>primeiroValor && segundoValor<terceiroValor) {
            System.out.println("Segundo "+segundoValor);
        }else if (terceiroValor<primeiroValor && terceiroValor>segundoValor || terceiroValor>primeiroValor && terceiroValor<segundoValor) {
            System.out.println("Segundo "+terceiroValor);
        }

        if (primeiroValor>segundoValor && primeiroValor>terceiroValor) {
            System.out.println("Terceiro "+primeiroValor);
        } else if (segundoValor>primeiroValor && segundoValor>terceiroValor) {
            System.out.println("Terceiro "+segundoValor);
        }else if (terceiroValor>primeiroValor && terceiroValor>segundoValor) {
            System.out.println("Terceiro "+terceiroValor);
        }
     }
     public void exercicio6() {
        System.out.println("Insira seu sexo (Feminino:1 Masculino:2)");
        double sexo = sc.nextDouble();
        System.out.println("Insira sua altura");
        double altura = sc.nextDouble();
        double pesoIdeal;
        if (sexo == 1) {
            pesoIdeal = (62.1*altura) - 44.7;
            System.out.println("Seu peso ideal é "+pesoIdeal);
        } else if (sexo == 2){
            pesoIdeal = (72.7*altura) - 58;
            System.out.println("Seu peso ideal é "+pesoIdeal);
        } else {
            System.out.println( "erro");
        }
     }
     public void exercicio7() { 
        System.out.println("Informe a nota 1 do aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do aluno");
        int nota2 = sc.nextInt();
        double mediaAluno = nota1;
        mediaAluno += nota2;
        mediaAluno /= 2;
        System.out.println("A média do aluno é "+mediaAluno);
        boolean mediaAprovado = mediaAluno >= 50;
        System.out.println("O Aluno Está Aprovado por Nota? "+mediaAprovado);
        System.out.println("Informe a Frequência do Aluno:");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovado = frequenciaAluno >= 75;
        System.out.println("O Aluno Está Aprovado por Frequência? "+frequenciaAprovado);
        boolean aprovacaoFinal = (mediaAprovado==true)&&(frequenciaAprovado==true);
        System.out.println("O Aluno Está Aprovado no Curso? "+aprovacaoFinal);
        
     } 
     public void exercicio8() {
        System.out.println("Informe o número");
        int numero = sc.nextInt();
        int resultado = numero % 2;
        if (resultado == 0){
            System.out.println("Número Par");
        }else {
            System.out.println("Número Impar");
        }
     }
     public void exercicio9() {
        System.out.println("Insira sua nota");
        int nota = sc.nextInt();
        if (nota >= 7){
            System.out.println("Você Passou Direto");
        }else if (nota > 5){
            System.out.println("Você Tem Direito a uma Prova de Recuperação");
        }else{
            System.out.println("Você Reprovou Direto");
        } 
     }
     public void exercicio10() {
        System.out.println("Insira a Letra");
        String letra = sc.nextLine();
        if (letra = "A"){
            
        }(letra = "E"){

        }(letra = "I") || letra = "O" || letra = "U"){

        }     
     }
}
