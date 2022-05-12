package com.company;

public class Horse extends Animal{
    public Horse(String name, int age, String colour, String food) {
        super(name, age, colour, food);
    }

    @Override
    void eat() {
        super.eat();
    }
}
