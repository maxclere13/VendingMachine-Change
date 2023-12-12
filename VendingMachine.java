/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */




package vendingmachine;
/**

 File name: VendingChange.java

 This program should do the following:
  Prompts the user to enter cost of item (between 25 cents and a dollar, in 5-cent increments).
  Echoes the cost of the item.
  Determines and displays the change assuming payment of a dollar.
  Assumes amount entered meets the stated criteria, between 25 cents and a dollar, and in 5-cent increments.

*/
import java.util.*;

public class VendingMachine
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter price for item " + 
        	"(from 25 cents to a dollar, in 5-cent increments) : ");
        
        int originalAmount = keyboard.nextInt();
        int change = 100 - originalAmount;

        int quarters = change/25;
        change = change%25;// remaining change after deducting quarters
        int dimes = change/10;
        change = change%10;// remaining change after deducting dimes, too
        int nickels = change/5;

        //The grammar will be incorrect if any of the values are 1
        //because the required program statements to handle that
        //situation have not been covered, yet.   
        System.out.println
        	("You bought an item for " + originalAmount
        	+ " and gave me a dollar.");
        System.out.println("so your change is");
        System.out.println(quarters + " quarters,");
        System.out.println(dimes + " dimes, and");
        System.out.println(nickels + " nickel.");
    }
}
