package jp.ac.it_college.std.s14005.pdp.adapter;

/**
 * Created by s14005 on 15/06/03.
 */
public class PrintBanner2 extends Print2 {
    private Banner banner;
    public PrintBanner2(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
