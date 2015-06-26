package jp.ac.it_college.std.s14005.pdp.interpreter;


/**
 * Created by s14005 on 15/06/18.
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
