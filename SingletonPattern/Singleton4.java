/**
 * 懒(饱)汉式单例-双重加锁检查DCL（Double Check Lock）
 * 
 * 优点：懒加载，线程安全。
 * 
 * 注：实例必须有 volatile 关键字修饰，其保证初始化完全。
 */
public class Singleton4 {
    private volatile static Singleton4 instance = null; // volatile 修饰,保证初始化完全

    private Singleton4() { // 私有构造方法
    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void toLog(String s) {
        System.err.println(s + " " + this);
    }
}