package Projeto;

import javax.swing.JOptionPane;

import Projeto.Conta.PessoaFisica;
import Projeto.Conta.PessoaJuridica;

public class App {
    public static void main(String[] args) {
        // criar o meu vetor de objetos
        PessoaJuridica clientePJ[] = new PessoaJuridica[10];
        PessoaFisica clientePF[] = new PessoaFisica[10];
        // começar meu banco
        boolean aberto = true;
        int contPJ = 0;// contador de contas pj abertas
        int contPF = 0;// contador de contas pf abertas
        while (aberto) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                    + "\n 1-Abrir Conta PJ"
                    + "\n 2-Abrir Cont PF"
                    + "\n 3-Acessar Conta PJ"
                    + "\n 4-Acessar Conta PF"
                    + "\n 5-Sair"));

            // 1-Abrir Conta PJ

            if (acao == 1) {// abrir a conta pj
                // criar um objeto
                clientePJ[contPJ] = new PessoaJuridica();// chamei o construtor
                // preencher os atributos do objeto
                clientePJ[contPJ].setNome(JOptionPane.showInputDialog("Informe o nome da Empresa: "));
                clientePJ[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ da Empresa: "));
                clientePJ[contPJ].setnConta(1000 + contPJ);
                clientePJ[contPJ].setSaldo(0);
                // acrescimo no contador
                JOptionPane.showMessageDialog(null, "Conta PJ criada com Sucesso");
                JOptionPane.showMessageDialog(null, "Numero da conta PJ é: " + clientePJ[contPJ].getnConta());
                contPJ++;
            }

            // 2-Abrir Cont PF

            else if (acao == 2) {// abrir a conta pf
                // criar um objeto
                clientePF[contPF] = new PessoaFisica();// chamei o construtor
                // preencher os atributos do objeto
                clientePF[contPF].setNome(JOptionPane.showInputDialog("Informe o nome do Cliente: "));
                clientePF[contPF].setnCpf(JOptionPane.showInputDialog("Informe o CPF do Cliente: "));
                clientePF[contPF].setnConta(2000 + contPF);
                clientePF[contPF].setSaldo(0);
                // acrescimo no contador
                JOptionPane.showMessageDialog(null, "Conta PF criada com Sucesso");
                JOptionPane.showMessageDialog(null, "Numero da conta PF é: " + clientePF[contPF].getnConta());
                contPF++;
            }

            // 3-Acessar Conta PJ

            else if (acao == 3) {
                // acessar conta pj ja criada
                // localizar a conta no vetor
                int i;// contador
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta PJ buscada: "));
                for (i = 0; i < clientePJ.length; i++) {
                    if (nContaBuscada == clientePJ[i].getnConta()) {
                        JOptionPane.showMessageDialog(null, "Conta PJ encontrada");
                        break;
                    }
                }

                JOptionPane.showMessageDialog(null, "Empresa: "+clientePJ[i].getNome()+"\n CNPJ: "+clientePJ[i].getnCnpj());

                // menu de acesso da conta
                boolean acesso = true;
                while (acesso) {// acessei a conta
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desesjada:"
                            + "\n 1- Consultar o Saldo"
                            + "\n 2- Realizar um Saque"
                            + "\n 3- Realizar um Depósito"
                            + "\n 4- Voltar"));

                    // 1- Consultar o Saldo

                    if (acao2 == 1) {// saldo
                        JOptionPane.showMessageDialog(null,
                                clientePJ[i].getNome() + ", seu saldo é de R$ " + clientePJ[i].getSaldo());
                    }

                    // 2- Realizar um Saque

                    else if (acao2 == 2) {// saque
                        clientePJ[i].saque();
                    }

                    // 3- Realizar um Depósito

                    else if (acao2 == 3) {// depósito
                        clientePF[i].deposito();
                    }
                }
            }

            // 4-Acessar Conta PF

            else if (acao == 4) {
                // acessar conta pf ja criada
                // localizar a conta no vetor
                int i;// contador
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta PF buscada: "));
                boolean acesso = true;
                for (i = 0; i < clientePF.length; i++) {
                    if (nContaBuscada == clientePF[i].getnConta()) {
                        JOptionPane.showMessageDialog(null, "Conta PF encontrada");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "Conta PF não encontrada");
                        acesso=false;
                    }
                }

                JOptionPane.showMessageDialog(null, "Cliente: " + clientePF[i].getNome()+"\n CPF: "+clientePF[i].getnCpf());

                // menu de acesso da conta
                while (acesso) {// acessei a conta
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desesjada:"
                            + "\n 1- Consultar o Saldo"
                            + "\n 2- Realizar um Saque"
                            + "\n 3- Realizar um Depósito"
                            + "\n 4- Voltar"));
                    if (acao2 == 1) {// saldo
                        JOptionPane.showMessageDialog(null,
                                clientePF[i].getNome() + ", seu saldo é de R$ " + clientePF[i].getSaldo());
                    }

                    // 2- Realizar um Saque

                    else if (acao2 == 2) {// saque
                        clientePF[i].saque();
                    }

                    // 3- Realizar um Depósito

                    else if (acao2 == 3) {// depósito
                        clientePF[i].deposito();
                    }

                    // 4- Voltar

                    else if(acao2==4){//voltar
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null,"Opção inválida"); 
                    }
                }
            }else if(acao==5){

            }

        }
    }
}
