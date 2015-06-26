package jp.ac.it_college.std.s14005.pdp.af.tablefactory;

import jp.ac.it_college.std.s14005.pdp.af.factory.Link;

/**
 * Created by s14005 on 15/06/10.
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
