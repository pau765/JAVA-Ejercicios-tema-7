public class Main {
    public static void main(String[] args) throws Exception {
        Pila p = new Pila();
        System.out.println(p.desapilar());
        for (int i = 0; i < 10; i++) {
            p.apilar(i);
        }
        Integer num = p.desapilar();
        while (num != null) {
            System.out.println(num + " ");
            num = p.desapilar();
        }
    }
}
