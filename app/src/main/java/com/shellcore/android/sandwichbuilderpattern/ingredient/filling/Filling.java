package com.shellcore.android.sandwichbuilderpattern.ingredient.filling;

import com.shellcore.android.sandwichbuilderpattern.ingredient.Ingredient;

/**
 * Created by Shell on 02/12/2017.
 */

public abstract class Filling implements Ingredient {

    @Override
    public abstract String getDescription();

    @Override
    public abstract int getKcal();


}
