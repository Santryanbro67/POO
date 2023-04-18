package imc;

import java.util.Scanner;

public class IMC {
    Scanner sc = new Scanner(System.in);

    public void imc() {
        System.out.println("digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("qual seu sexo? feminino[1] masculino[2]");
        int sexo = sc.nextInt();
        System.out.println("qual sua altura?[m]");
        double altura = sc.nextDouble();
        System.out.println("qual seu peso?[kg]");
        double peso = sc.nextDouble();
        double pesoIdeal;
        double pesoNecessario;

        if (sexo == 1) { // feminino
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("peso ideal ideal é " + pesoIdeal);
            pesoNecessario = peso - pesoIdeal;

            if (pesoNecessario > 0) {
                System.out.println("Você Precisa perder " + pesoNecessario);
            } else {
                pesoNecessario *= -1;
                System.out.println("você precisa ganhar " + pesoNecessario);
            }
        } else if (sexo == 2) { // masculino
            pesoIdeal = 72.7 * altura - 58;
            System.out.println("seu peso ideal é" + pesoIdeal);
            pesoNecessario = peso - pesoIdeal;

            if (pesoNecessario > 0) {
                System.out.println("Você Precisa perder " + pesoNecessario);
            } else {
                pesoNecessario *= -1;
                System.out.println("você precisa ganhar " + pesoNecessario);
            }
        } else {
            System.out.println("opção invalida pera o sexo");
        }
        double imc;
        imc = peso / (altura * altura);

        System.out.println("Seu IMC: " + imc);

        if (imc < 20) {
            System.out.println("Abaixo do Peso");
            System.out.println("Atividade Diícil- Precisa Ganhar Massa");
            if (idade >= 16 && idade <= 25) {
                System.out.println("Faixa etária I");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Luta");
            } else if (idade > 25 && idade <= 35) {
                System.out.println("Faixa etária II");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Luta e Musculação Intensa");
            } else if (idade > 35 && idade <= 45) {
                System.out.println("Faixa etária III");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Luta e Musculação Intensa");
            } else if (idade > 45 && idade <= 55) {
                System.out.println("Faixa etária IV");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Luta e Pilates");
            } else if (idade > 55 && idade <= 65) {
                System.out.println("Faixa etária V");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Pilates");
            } else if (idade > 65) {
                System.out.println("Faixa etária VI");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Pilates");
            } else {
                System.out.println(nome + " é novo para praticar exercícios");
            }
        }

        else if (imc >= 20 && imc <= 27) {
            System.out.println("Peso Normal");
            System.out.println("Atividade Moderada");
            if (idade >= 16 && idade <= 25) {
                System.out.println("Faixa etária I");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Musculação Moderada e Dança");
            } else if (idade > 25 && idade <= 35) {
                System.out.println("Faixa etária II");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Musculação Moderada, Dança e Corrida");
            } else if (idade > 35 && idade <= 45) {
                System.out.println("Faixa etária III");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Musculação Moderada, Dança e Corrida");
            } else if (idade > 45 && idade <= 55) {
                System.out.println("Faixa etária IV");   
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Musculação Moderada, Dança e Corrida");
            } else if (idade > 55 && idade <= 65) {
                System.out.println("Faixa etária V");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Dança e Corrida");
            } else if (idade > 65) {
                System.out.println("Faixa etária VI");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Dança");
            } else {
                System.out.println(nome + " é novo para praticar exercícios");
            }
        }

        else {
            System.out.println("Acima do Peso");
            System.out.println("Atividade Leve - Perder Peso");
            if (idade >= 16 && idade <= 25) {
                System.out.println("Faixa etária I");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Musculação Leve e Ioga");
            } else if (idade > 25 && idade <= 35) {
                System.out.println("Faixa etária II");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Ioga");
            } else if (idade > 35 && idade <= 45) {
                System.out.println("Faixa etária III");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Ioga");
            } else if (idade > 45 && idade <= 55) {
                System.out.println("Faixa etária IV");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Musculação Leve e Ioga");
            } else if (idade > 55 && idade <= 65) {
                System.out.println("Faixa etária V");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Musculação Leve e Ioga");
            } else if (idade > 65) {
                System.out.println("Faixa etária VI");
                System.out.println("Atividade Recomendada para " + idade + " anos");
                System.out.println("Musculação Leve e Ioga");
            } else {
                System.out.println(nome + " é novo para praticar exercícios");
            }
        }
    }
}
