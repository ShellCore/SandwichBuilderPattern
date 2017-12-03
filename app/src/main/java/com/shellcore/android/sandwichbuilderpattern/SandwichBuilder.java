package com.shellcore.android.sandwichbuilderpattern;

import com.shellcore.android.sandwichbuilderpattern.ingredient.Ingredient;

/**
 * Created by Shell on 02/12/2017.
 */

public class SandwichBuilder {

    public Sandwich build(Sandwich sandwich, Ingredient ingredient) {
        sandwich.addIngredient(ingredient);
        return sandwich;
    }
}
