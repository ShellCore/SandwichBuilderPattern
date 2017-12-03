package com.shellcore.android.sandwichbuilderpattern.ingredient;

import com.shellcore.android.sandwichbuilderpattern.ingredient.Ingredient;

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
