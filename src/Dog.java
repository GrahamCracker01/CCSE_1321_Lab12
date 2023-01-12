//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Dog {

    public int age;
    public double weight;
    public String name, furColor, breed;

    public String bark() {
        return "Woof! Woof!";
    }

    public String rename(String i) {
        name = i;
        return name;
    }

    public double eat(double i) {
        weight += i;
        return weight;
    }

    public Dog(int i, double j, String k, String l, String m) {
        age = i;
        weight = j;
        name = k;
        furColor = l;
        breed = m;
    }


}