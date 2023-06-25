package com.tj.designpatterns.visitor;

/**
 * @author nitianyi
 * @since 2023/6/21
 */
public class Cat implements Animal {

    @Override
    public String name() {
        return "Cat";
    }

    @Override
    public void accept(InteractVisitor visitor) {
        visitor.visitorCat(this);
    }
}
