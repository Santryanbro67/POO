package POOHeranca;

import POOHeranca.Pessoas.Alunos;
import POOHeranca.Pessoas.Funcionarios;
import POOHeranca.Pessoas.Pessoas;
import POOHeranca.Pessoas.Professores;


public class App {
    public static void main(String[] args) {
        //objetos
        Pessoas pessoa01=new Pessoas();
        Alunos aluno01=new Alunos();
        Funcionarios funcionario01=new Funcionarios();
        Professores prof01=new Professores();
        

        //set
        pessoa01.setNome("Alberto Silva");
        pessoa01.setEndereco("Avenida Saudades, 1323");
        pessoa01.setnCpf("123.456.789-10");
        pessoa01.setIdade(40);
        aluno01.setnMatricula(321465978);
        aluno01
        funcionario01.setSetor("Manutenção");
        prof01.setDisciplina("Matemática");
    }
    
}
