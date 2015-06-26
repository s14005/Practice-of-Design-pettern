package jp.ac.it_college.std.s14005.pdp.af.factory;

/**
 * Created by s14005 on 15/06/10.
 */
public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try{
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("クラス " + classname + " が見つかりません。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
