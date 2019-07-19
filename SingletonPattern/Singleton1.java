/**
 * 饿汉式单例
 * 
 * 优点：饿汉模式天生是线程安全的，使用时没有延迟。
 * 
 * 缺点：启动时即创建实例，启动慢，有可能造成资源浪费。
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() { // 私有构造方法
    }

    public static Singleton1 getInstance() {
        return instance;
    }

    public void toLog(String s) {
        System.err.println(s + " " + this);
    }
}