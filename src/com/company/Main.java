package com.company;

public class Main {

    public static void main(String[] args) {
	Horse horse = new Horse("Ahiless",4,"black"," chop");
        System.out.println(horse);

        Animal horse1 = new Horse("Boika",7,"brown"," grass");
        System.out.println(horse1);
        horse1.eat();

        Animal dog = new Dog("Alabai",3,"white"," meat");
        System.out.println(dog);
        dog.eat();
    }
}
