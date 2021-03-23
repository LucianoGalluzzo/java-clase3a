public class Circulo extends FiguraGeometrica{

    private double ratio;

    public Circulo(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public double area(){
        return Math.PI*Math.pow(ratio, 2);
    }

    @Override
    public String toString(){
        return "Soy un Circulo";
    }
}
