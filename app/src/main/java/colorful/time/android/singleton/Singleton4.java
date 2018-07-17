package colorful.time.android.singleton;


import java.io.ObjectStreamException;

public class Singleton4 {

    private static class SingletonHolder{
        final static Singleton4 instance =  new Singleton4();
    }

    private Singleton4(){
    }

    public Singleton4 getInstance(){
        return SingletonHolder.instance;
    }

    // 防止反序列化获取多个对象的漏洞。
    // 无论是实现Serializable接口，或是Externalizable接口，当从I/O流中读取对象时，readResolve()方法都会被调用到。
    // 实际上就是用readResolve()中返回的对象直接替换在反序列化过程中创建的对象。
    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.instance;
    }

}
