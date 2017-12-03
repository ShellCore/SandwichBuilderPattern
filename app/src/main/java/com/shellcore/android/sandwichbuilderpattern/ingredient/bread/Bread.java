package com.shellcore.android.sandwichbuilderpattern.ingredient.bread;

import com.shellcore.android.sandwichbuilderpattern.ingredient.Ingredient;

/**
 * Created by Shell on 02/12/2017.
 */

public abstract class Bread implements Ingredient {

    @Override
    public abstract String getDescription();

    @Override
    public abstract int getKcal();

    String decoration;
    int decorationKcal;

    public String getDecoration() {
        return decoration;
    }

    public int getDecorationKcal() {
        return decorationKcal;
    }
}
