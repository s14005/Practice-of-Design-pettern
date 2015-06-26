package jp.ac.it_college.std.s14005.pdp.af.tablefactory;

import jp.ac.it_college.std.s14005.pdp.af.factory.Page;

/**
 * Created by s14005 on 15/06/10.
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
