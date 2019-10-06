//    WAP to change case of given inputString to uppercase by using String toUpperCase().

import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String UserInputString = scan.nextLine().toUpperCase();
        System.out.println(UserInputString);
    }
}
