package com.tj.designpatterns.visitor;

/**
 * @author nitianyi
 * @since 2023/6/21
 */
public interface Animal {

    String name();

    void accept(InteractVisitor visitor);

}
