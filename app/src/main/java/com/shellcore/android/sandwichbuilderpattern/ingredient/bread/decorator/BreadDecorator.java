package com.shellcore.android.sandwichbuilderpattern.ingredient.bread.decorator;

import com.shellcore.android.sandwichbuilderpattern.ingredient.bread.Bread;

/**
 * Created by Shell on 02/12/2017.
 */

public abstract class BreadDecorator extends Bread {

    @Override
    public abstract String getDecoration();

    @Override
    public abstract int getDecorationKcal();
}
