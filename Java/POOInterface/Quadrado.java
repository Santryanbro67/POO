package POOInterface;

public class Quadrado implements FigurasGeometricas{
    int lado;

    //construtor com parâmetros
    public Quadrado(int lado) {
        this.lado = lado;
    }
 
    //sets e gets
    public int getLados() {
        return lado;
    }

    public void setLados(int lado) {
        this.lado = lado;
    }

    //métodos da classe FigurasGeometricas(Interface) 
    @Override
    public double getArea() {
        int area= lado*lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro = 4*lado;
        return perimetro;
    }

    
    
}
