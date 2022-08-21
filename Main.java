public class Main {
    public static void main(String[] args) {
        /* Llave Maestra */
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.setLlaveDelTesoro("SecretKeyUnique");

        System.out.println(singleton.getLlaveDelTesoro());
        System.out.println(singleton2.getLlaveDelTesoro());
    }
}