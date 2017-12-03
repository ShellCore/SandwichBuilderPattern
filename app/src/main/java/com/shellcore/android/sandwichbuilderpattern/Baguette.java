package com.shellcore.android.sandwichbuilderpattern;

/**
 * Created by Shell on 02/12/2017.
 */

public class Baguette extends Bread {

    @Override
    public String getDescription() {
        return "Baguette";
    }

    @Override
    public int getKcal() {
        return 150;
    }
}
