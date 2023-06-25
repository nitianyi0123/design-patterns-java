package com.tj.designpatterns.visitor;

/**
 * @author nitianyi
 * @since 2023/6/21
 */
public interface InteractVisitor {

    void visitorDog(Dog dog);

    void visitorCat(Cat cat);

    void visitorTiger(Tiger tiger);
}
