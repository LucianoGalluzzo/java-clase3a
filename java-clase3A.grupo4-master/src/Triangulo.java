public class Triangulo extends FiguraGeometrica{

    private double base;
    private double h;

    public Triangulo(double base, double h) {
        this.base = base;
        this.h = h;
    }

    @Override
    public double area(){
        return (base*h)/2;
    }

    @Override
    public String toString(){
        return "Soy un Triangulo";
    }
}
