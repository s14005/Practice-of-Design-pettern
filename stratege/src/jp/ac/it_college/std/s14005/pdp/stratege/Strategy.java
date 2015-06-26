package jp.ac.it_college.std.s14005.pdp.stratege;

/**
 * Created by s14005 on 15/06/10.
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
