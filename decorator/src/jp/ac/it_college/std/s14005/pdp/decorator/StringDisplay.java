package jp.ac.it_college.std.s14005.pdp.decorator;

/**
 * Created by s14005 on 15/06/11.
 */
public class StringDisplay extends Display {
    private String string;
    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        }else{
            return null;
        }
    }
}
