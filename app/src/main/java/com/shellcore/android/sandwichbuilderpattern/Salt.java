package com.shellcore.android.sandwichbuilderpattern;

/**
 * Created by Shell on 02/12/2017.
 */

public class Salt implements Ingredient {

    @Override
    public String getDescription() {
        return "Sal";
    }

    @Override
    public int getKcal() {
        return 0;
    }
}
