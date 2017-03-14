public class Main {

    public static void main(String[] args) {
        Client a = new Client();
        Client b = new Client(a.getG(), a.getC());

        a.setB(b.getA());
        b.setB(a.getA());

        System.out.println(a.getPublicKey());
        System.out.println(b.getPublicKey());
    }
}
