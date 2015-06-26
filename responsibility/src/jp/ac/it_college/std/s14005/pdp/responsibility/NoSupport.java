package jp.ac.it_college.std.s14005.pdp.responsibility;

/**
 * Created by s14005 on 15/06/16.
 */
public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
