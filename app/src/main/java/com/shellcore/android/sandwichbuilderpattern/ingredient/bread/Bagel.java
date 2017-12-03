package com.shellcore.android.sandwichbuilderpattern.ingredient.bread;

/**
 * Created by Shell on 02/12/2017.
 */

public class Bagel extends Bread {
    @Override
    public String getDescription() {
        return "Rosquilla";
    }

    @Override
    public int getKcal() {
        return 280;
    }
}
