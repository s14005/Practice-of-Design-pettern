package jp.ac.it_college.std.s14005.pdp.prototype.framework;

/**
 * Created by s14005 on 15/06/04.
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
