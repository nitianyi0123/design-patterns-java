package com.tj.designpatterns.visitor;

/**
 * @author nitianyi
 * @since 2023/6/21
 */
public class Dog implements Animal {

    @Override
    public String name() {
        return "Dog";
    }

    @Override
    public void accept(InteractVisitor visitor) {
        visitor.visitorDog(this);
    }
}
