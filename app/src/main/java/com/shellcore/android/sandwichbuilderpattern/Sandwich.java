package com.shellcore.android.sandwichbuilderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shell on 02/12/2017.
 */

public class Sandwich {

    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        for (Ingredient ingredient : ingredients) {
            sb.append(ingredient.getDescription())
                    .append(" ");
        }
        return sb.toString();
    }

    public int getKcal() {
        int kcal=  0;

        for (Ingredient ingredient : ingredients) {
            kcal += ingredient.getKcal();
        }

        return kcal;
    }
}
