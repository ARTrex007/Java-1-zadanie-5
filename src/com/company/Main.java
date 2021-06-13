package com.company;


import java.util.ArrayList;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Animal animal1 = new Animal("Stefan", "Pies", true, 3);
        Animal animal2 = new Animal("Ryszard", "Kot", false, 2);
        Animal animal3 = new Animal("Daisy", "Koń", false, 10);
        Human human1 = new Human("janusz", "Kowalski", "Mechanik", 54, 74, animal1);

        System.out.println(human1.animal_pet.imie);

        animal2.Take_for_a_walk();
        animal2.Take_for_a_walk();
        animal2.Take_for_a_walk();
        animal2.Take_for_a_walk();
        animal2.Take_for_a_walk();
        animal2.Feed();
        animal1.Feed();
        animal3.Take_for_a_walk();
    }
}