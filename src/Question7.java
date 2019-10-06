//WAP to print the totalWeight of given inputString.
//
//        totalWeight can be calculate by adding *ASCII* value of all the characters.
//        for example:
//        inputString = "Abc";
//        totalWeight = 65 + 98 + 99;
//
//        where ASCII values:
//        A --> 65
//        b --> 98
//        c --> 99

import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("InputString = ");
        String UserInputString = scan.nextLine();

        int TotalWeight = 0;
        for( int i=0; i<UserInputString.length(); i++)
        {
            TotalWeight = TotalWeight + UserInputString.charAt(i);
        }
        System.out.println("TotalWeight = " + TotalWeight);
    }
}
