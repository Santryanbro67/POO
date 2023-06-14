package Projeto.Conta;

import javax.swing.JOptionPane;

public class Conta {
    // superclasse - atributos genericos
    // atributos da superclasse
    String nome;
    String endereco;
    int nConta;
    double saldo;

    // métodos
    // construtor default(vazio)
    // sets and gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // métodos opcionais
    public void saque() {
        double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do saque"));
        saldo -= saque;
    }

    public void deposito() {
        double deposito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do depósito"));
        saldo += deposito;
    }

}
