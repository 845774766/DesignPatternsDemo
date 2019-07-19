/**
 * 懒(饱)汉式单例
 * 
 * 优点：懒加载启动快，资源占用小，使用时才实例化，无锁。
 * 
 * 缺点：非线程安全。
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() { // 私有构造方法
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public void toLog(String s) {
        System.err.println(s + " " + this);
    }
}