package com.company;

public class Human
{
    public String imie, nazwisko, zawod;
    public int wiek;
    public double masa;
    public static int counter=0;
    public Animal animal_pet;

    public Human(String imie, String nazwisko, String zawod, int wiek, double masa, Animal animal) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zawod = zawod;
        this.wiek = wiek;
        this.masa = masa;
        this.animal_pet = animal;
        System.out.println("Utworzono obiekt HUMAN numer: " + counter);
        counter++;
    }
}
