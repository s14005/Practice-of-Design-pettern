package jp.ac.it_college.std.s14005.pdp.mediator;

import jp.ac.it_college.std.s14005.pdp.mediator.Colleague;

import java.awt.*;

/**
 * Created by s14005 on 15/06/16.
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;
    public ColleagueButton(String caption) {
        super(caption);
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
