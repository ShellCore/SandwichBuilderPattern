package com.shellcore.android.sandwichbuilderpattern.ingredient.bread.decorator;

import com.shellcore.android.sandwichbuilderpattern.ingredient.bread.Bread;

/**
 * Created by Shell on 02/12/2017.
 */

public class Toasted extends BreadDecorator {

    private Bread bread;

    public Toasted(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getKcal() {
        return 0;
    }

    @Override
    public String getDecoration() {
        return "Tostado";
    }

    @Override
    public int getDecorationKcal() {
        return 0;
    }
}
