package com.tj.designpatterns.visitor;

/**
 * @author nitianyi
 * @since 2023/6/21
 */
public class IntroduceVisitor implements InteractVisitor {

    @Override
    public void visitorDog(Dog dog) {
        System.out.println(dog.name());
    }

    @Override
    public void visitorCat(Cat cat) {
        System.out.println(cat.name());
    }

    @Override
    public void visitorTiger(Tiger tiger) {
        System.out.println(tiger.name());
    }
}
