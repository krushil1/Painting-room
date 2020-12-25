
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    final int COVERAGE = 350;  //paint covers 350 sq ft/gal

    //declare integers length, width, and height;
    int length, width, height;
    //declare double totalSqFt;
    double totalSqFt;    
    //declare double paintNeeded;
    double paintNeeded;
	  //declare and initialize Scanner object
    Scanner keyboard = new Scanner(System.in);
    //Prompt for and read in the length of the room
    System.out.print("Enter the length of the room: ");
    length = keyboard.nextInt();
    //Prompt for and read in the width of the room
    System.out.print("Enter the width of the room: ");
    width = keyboard.nextInt();
    //Prompt for and read in the height of the room
    System.out.print("Enter the height of the room: ");
    height = keyboard.nextInt();
    //Compute the total square feet to be painted--think
    //about the dimensions of each wall
    totalSqFt = 2*width*height + 2*length*height;
    //Compute the amount of paint needed
    paintNeeded = totalSqFt / COVERAGE;

    //Print the length, width, and height of the room and the
    //number of gallons of paint needed.
    System.out.println("Length: " + length + ", Width: " + width + ", Height: " + height);
    System.out.println(paintNeeded + " gallons of paint will be needed.");
    
    //user input for doors
    System.out.print("Enter the number of doors: ");
    int doors = keyboard.nextInt();
    
    //user input for windows
    System.out.print("Enter the number of windows: ");
    int windows = keyboard.nextInt();
    
    //multiplies door input times 20
    doors = doors*20;
    //multiplies the window input times 15
    windows = windows*15;
    
    //new variable to add door and window together.
    int doorWindow = doors + windows;
    //substracts totalSqFt from the sum of doorWindow
    totalSqFt = totalSqFt - doorWindow;
    //calculates how much paint will be needed after adding doors and windows
    paintNeeded = totalSqFt / COVERAGE;
    
    System.out.print("The paint needed after the calculation of door and window is " + paintNeeded + " gallons");
    
    
  }
}
