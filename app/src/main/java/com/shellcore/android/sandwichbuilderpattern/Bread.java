package com.shellcore.android.sandwichbuilderpattern;

/**
 * Created by Shell on 02/12/2017.
 */

public abstract class Bread implements Ingredient {

    @Override
    public abstract String getDescription();

    @Override
    public abstract int getKcal();
}
