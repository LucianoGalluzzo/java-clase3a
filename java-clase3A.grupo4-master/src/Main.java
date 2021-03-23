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

    }
}
