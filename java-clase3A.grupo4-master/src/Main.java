public class Main {

    public static void main(String[] args) {
        Password passSimple= new PasswordSimple();
        Password passInter = new PasswordIntermedia();
        Password passF = new PasswordFuerte();

        passSimple.setValue("abc456");
        passInter.setValue("abc456");
        passF.setValue("abc456");

        System.out.println(passSimple.getValue());
        System.out.println(passInter.getValue());
        System.out.println(passF.getValue());

        FiguraGeometrica[] arr = new FiguraGeometrica[5];

        arr[0] = new Triangulo(2, 1.5);
        arr[1] = new Rectangulo(2, 2);
        arr[2] = new Circulo(3);
        arr[3] = new Triangulo(4, 2.3);
        arr[4] = new Rectangulo(2.5, 1.6);

        System.out.println("El area promedio es igual a " + FiguraGeometricaUtil.areaPromedio(arr));

    }
}
