package POOInterface;

public class Trapezio implements FigurasGeometricas {
    int baseMa;
    int baseMe;
    int altura;
    int lado1;
    int lado2;

    //construtores
   public Trapezio(int baseMa, int baseMe, int altura, int lado1, int lado2) {
        this.baseMa = baseMa;
        this.baseMe = baseMe;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Getters and Setters
    public int getBaseMa() {
        return baseMa;
    }

    

    public void setBaseMa(int baseMa) {
        this.baseMa = baseMa;
    }

    public int getBaseMe() {
        return baseMe;
    }

    public void setBaseMe(int baseMe) {
        this.baseMe = baseMe;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    //métodos Interface
    @Override
    public double getArea() {
        double area=((baseMa+baseMe)*altura)/2;
        return area;
    }
    @Override
    public String getNomeFigura() {
        return "Trapézio";
    }
    @Override
    public double getPerimetro() {
        double perimetro=lado1+lado2+baseMa+baseMe;
        return perimetro;
    }

    
    
    
}
