package com.shellcore.android.sandwichbuilderpattern;

/**
 * Created by Shell on 02/12/2017.
 */

public class Ham extends Filling {

    @Override
    public String getDescription() {
        return "Jamón";
    }

    @Override
    public int getKcal() {
        return 64;
    }
}
