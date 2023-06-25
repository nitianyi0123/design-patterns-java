package com.tj.designpatterns.visitor;

/**
 * @author nitianyi
 * @since 2023/6/21
 */
public class Main {

    public static void main(String[] args) {
        InteractVisitor visitor = new IntroduceVisitor();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        cat.accept(visitor);
        dog.accept(visitor);
        tiger.accept(visitor);
    }
}
