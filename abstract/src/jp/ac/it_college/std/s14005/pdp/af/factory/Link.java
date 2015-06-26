package jp.ac.it_college.std.s14005.pdp.af.factory;

/**
 * Created by s14005 on 15/06/10.
 */
public abstract class Link extends Item{
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
