package colorful.time.android.singleton;


//饿汉式
public class Singleton1 {
    private final static Singleton1 INSTANCE =new Singleton1();

    private Singleton1(){

    }

    public Singleton1 getInstance(){
        return INSTANCE;
    }

}
