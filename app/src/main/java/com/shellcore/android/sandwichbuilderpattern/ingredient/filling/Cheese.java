package com.shellcore.android.sandwichbuilderpattern.ingredient.filling;

/**
 * Created by Shell on 02/12/2017.
 */

public class Cheese extends Filling {

    @Override
    public String getDescription() {
        return "Queso";
    }

    @Override
    public int getKcal() {
        return 78;
    }
}
