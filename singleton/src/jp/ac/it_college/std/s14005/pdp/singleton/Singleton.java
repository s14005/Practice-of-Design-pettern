package jp.ac.it_college.std.s14005.pdp.singleton;

/**
 * Created by s14005 on 15/06/04.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("インスタンスを生成しました。");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
