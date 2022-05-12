package com.company;

public class Dog extends Animal{
    public Dog(String name, int age, String colour, String food) {
        super(name, age, colour, food);
    }

    @Override
    void eat() {
        super.eat();
    }
}
