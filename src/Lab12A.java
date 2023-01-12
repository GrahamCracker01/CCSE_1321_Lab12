//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab12A {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intLegs;
        boolean boolRoll;
        String strMat;

        //initial output and get input
        System.out.print("You are about to create a chair.\nHow many legs does your chair have: ");
        intLegs = scan.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        boolRoll = scan.nextBoolean();
        System.out.print("What is your chair made of: ");
        strMat = scan.next();

        //create chair object with input
        Chair chairObj = new Chair(intLegs, boolRoll, strMat);

        //output
        System.out.print("Your chair has " + chairObj.numOfLegs + " legs, ");
        if (chairObj.rolling) {
            System.out.print("is rolling, ");
        }
        else {
            System.out.print("is not rolling, ");
        }
        System.out.println("and is made of " + chairObj.material + ".");
        System.out.println("This program is going to change that.");

        //change variables
        chairObj.numOfLegs = 4;
        chairObj.rolling = false;
        chairObj.material = "wood";

        //final output
        System.out.print("Your chair has " + chairObj.numOfLegs + " legs, ");
        if (chairObj.rolling) {
            System.out.print("is rolling, ");
        }
        else {
            System.out.print("is not rolling, ");
        }
        System.out.println("and is made of " + chairObj.material + ".");

    }
}