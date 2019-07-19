/**
 * 懒(饱)汉式单例-线程安全
 * 
 * 优点：同上，但加锁了。
 * 
 * 缺点：synchronized 为独占排他锁，并发性能差。即使在创建成功以后，获取实例仍然是串行化操作。
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() { // 私有构造方法
    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    public void toLog(String s) {
        System.err.println(s + " " + this);
    }
}