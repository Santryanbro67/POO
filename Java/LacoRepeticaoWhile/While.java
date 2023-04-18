package LacoRepeticaoWhile;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class While {
    Scanner sc = new Scanner(System.in);
    public void exemplo1() {
       int iteracao = 0;
       while (iteracao<10) {
        iteracao +=1;
        System.out.println("O nº da iteracao é "+iteracao);
       }
    }
    public void adivinhar() {
        Random rd = new Random();
        int nSorteado = rd.nextInt(10);
        boolean tenteNovamente;
        while (tenteNovamente) {
            System.out.println("Digite um numero");
            int nDigitado = sc.nextInt();
            if(nDigitado==nSorteado){
                System.out.println("Acertou Miseravi");
                tenteNovamente = false;
            }else{
                    System.out.println("Errrouuuuu");
                    tenteNovamente = true;
                }
            }
            
        }
        
    }
