public class Rectangulo extends FiguraGeometrica{

    private double base;
    private double h;

    public Rectangulo(double base, double h) {
        this.base = base;
        this.h = h;
    }

    @Override
    public double area(){
        return base*h;
    }

    @Override
    public String toString(){
        return "Soy un Rectangulo";
    }
}
