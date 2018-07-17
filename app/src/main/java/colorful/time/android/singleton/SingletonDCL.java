package colorful.time.android.singleton;


public class SingletonDCL {

    private SingletonDCL instance;

    private SingletonDCL(){}

    public SingletonDCL getInstance(){

        if(instance == null){
            synchronized (SingletonDCL.class){
                if(instance == null){
                    instance =  new SingletonDCL();
                }
            }
        }

        return instance;

    }
}
