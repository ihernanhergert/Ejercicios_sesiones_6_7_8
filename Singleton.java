public class Singleton {
    private static Singleton singleton;

    String llaveDelTesoro;

    private Singleton(){}

    public static Singleton getInstance() {
        if (singleton == null){
            singleton =  new Singleton();
        }
        return singleton;
    }
    public String getLlaveDelTesoro() {
        return llaveDelTesoro;
    }

    public void setLlaveDelTesoro(String llaveDelTesoro) {
        this.llaveDelTesoro = llaveDelTesoro;
    }

}
