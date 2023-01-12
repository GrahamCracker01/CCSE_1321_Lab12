//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab12B {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intAge;
        double dblWeight, dblFood;
        String strName, strFurColor, strBreed, strNewName;

        //initial output and get input
        System.out.print("You are about to create a  dog\nHow old is the dog: ");
        intAge = scan.nextInt();
        System.out.print("How much does the dog weigh: ");
        dblWeight = scan.nextDouble();
        System.out.print("What is the dog's name: ");
        strName = scan.next();
        System.out.print("What color is the dog: ");
        strFurColor = scan.next();
        System.out.print("What breed is the dog: ");
        strBreed = scan.next();

        //create dog object
        Dog dog1 = new Dog (intAge, dblWeight, strName, strFurColor, strBreed);

        //output
        System.out.println("\n" + dog1.name + " is a " + dog1.age + " year old " + dog1.furColor + " " + dog1.breed + " that weighs " + dog1.weight + " lbs.\n");
        System.out.println(dog1.bark());
        System.out.print(dog1.name + " is hungry, how much should he eat: ");
        dog1.eat(scan.nextDouble());
        System.out.print(dog1.name + " isn't a very good name. What should they be renamed to: ");
        dog1.rename(scan.next());
        System.out.println("\n" + dog1.name + " is a " + dog1.age + " year old " + dog1.furColor + " " + dog1.breed + " that weighs " + dog1.weight + " lbs.\n");


    }
}