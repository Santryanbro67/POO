package POOHeranca.Pessoas;

public class Funcionarios extends Pessoas {
    // atributos específicos
    String nif;
    String setor;

    // método
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}
