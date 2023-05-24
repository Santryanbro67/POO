package POOInterface;

public class Retangulo implements FigurasGeometricas {
    int base;
    int altura;

    // construtor
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Gets and Setters
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //métodos Interface
    @Override
    public double getArea() {
        int area = base * altura;
        return area;
    }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Retângulo";
    }

    @Override
    public double getPerimetro() {
        int perimetro = (base + altura) * 2;
        return perimetro;
    }

}
