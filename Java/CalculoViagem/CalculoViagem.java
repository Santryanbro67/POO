package CalculoViagem;

public class CalculoViagem{
    private static double calculoViagem;

    public static void main(String[] args) {
       double valorCombustivel = 4.99;
       int consumoTransporte = 10;
       int distanciaPercorrida = 100;
       double quantidadeLitrosCombustivel = distanciaPercorrida/consumoTransporte;
       calculoViagem = quantidadeLitrosCombustivel*valorCombustivel;
       System.out.println(x: "O valor gasto total foi de:");
       System.out.println("R$"+calculoViagem);
    }
}