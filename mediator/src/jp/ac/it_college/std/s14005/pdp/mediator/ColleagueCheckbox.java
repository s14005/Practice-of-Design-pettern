package jp.ac.it_college.std.s14005.pdp.mediator;

import jp.ac.it_college.std.s14005.pdp.mediator.Colleague;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by s14005 on 15/06/16.
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
