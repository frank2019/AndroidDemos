package colorful.time.android.singleton;
//懒汉式
public class Singleton2 {

    private Singleton2 instance;

    public synchronized Singleton2 getInstance(){
        if(instance == null){
            instance =  new Singleton2();
        }
        return instance;
    }

    private  Singleton2(){

    }
}
