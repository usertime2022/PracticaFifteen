package com.company;

public class Animal {
    private String name;
    private int age;
    private String colour;
    private String food;

    public Animal(String name, int age, String colour, String food) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


    void eat(){
        System.out.println(name+" is eating"+food);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
