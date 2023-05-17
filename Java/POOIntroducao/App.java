package POOIntroducao;

public class App {
    public static void main(String[] args) {

        RegistrarAluno aluno1 = new RegistrarAluno();// obj

        // modificar os atributos set
        aluno1.setNome("Ana Clara Pereira");
        aluno1.setEndereco("Rua das Flores, 123");
        aluno1.setIdade(29);
        aluno1.setNotaMatematica(9.5);
        aluno1.setNotaPortugues(10);
        aluno1.setNotaCiencias(8.3);

        // acessar os atributos get
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Endereço: " + aluno1.getEndereco());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Média " + aluno1.getMedia());

    }
}
