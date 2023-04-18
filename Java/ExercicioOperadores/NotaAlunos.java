package ExercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);
    public void notaFrequencia() {
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
    
}
