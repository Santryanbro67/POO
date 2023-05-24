package POOInterface;

public class Triangulo implements FigurasGeometricas {
    int altura;
    int base;

    // construtor
    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    // Getters and Setters
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    // métodos Interface
    @Override
    public double getArea() {
        double area = (base * altura) / 2;
        return area;
    }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Triângulo";
    }

    @Override
    public double getPerimetro() {
        double perimetro = base * 3;
        return perimetro;
    }

}
