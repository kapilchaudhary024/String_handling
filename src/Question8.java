//WAP to print UpperWeight of given inputString. UpperWeight can be find by
//        adding all the upper case characters of the inputString. in question--->7

import  java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("InputString = ");
        String UserInputString = scan.nextLine();

        char[] InputConArray = UserInputString.toCharArray();
        System.out.print("UpperWeightCharacter = ");
        int UpperCharacterWeight = 0;
        for(int i=0; i<UserInputString.length(); i++)
        {
            char c = UserInputString.charAt(i);
            if(Character.isUpperCase(c))
            {
                UpperCharacterWeight += c;
            }
        }
        System.out.println(UpperCharacterWeight);
    }
}
