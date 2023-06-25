package com.tj.designpatterns.visitor;

/**
 * @author nitianyi
 * @since 2023/6/21
 */
public class Tiger implements Animal {

    @Override
    public String name() {
        return "Tiger";
    }

    @Override
    public void accept(InteractVisitor visitor) {
        visitor.visitorTiger(this);
    }
}
