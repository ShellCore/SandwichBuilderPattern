package com.shellcore.android.sandwichbuilderpattern.ingredient.bread.decorator;

import com.shellcore.android.sandwichbuilderpattern.ingredient.bread.Bread;

/**
 * Created by Shell on 02/12/2017.
 */

class Open extends BreadDecorator {

    private Bread bread;

    Open(Bread bread) {
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
        return "Abierto";
    }

    @Override
    public int getDecorationKcal() {
        return bread.getKcal() / 2;
    }
}
