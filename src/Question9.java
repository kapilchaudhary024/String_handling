//WAP to print AbsoluteWeight of given inputString. Absolute weigth can be calulated as:
//
//        absoluteWeight = UpperWeight - LowerWeight;
//
//        1. absoluteWeight will always be a positive value.
//        2. LowerWeight can be find by adding all the lower case characters of the inputString.
//
//


import  java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("InputString = ");
        String UserInputString = scan.nextLine();

        char[] InputConArray = UserInputString.toCharArray();
        //System.out.print("UpperWeightCharacter = ");
        int UpperCharacterWeight = 0;
        int LowerCharacterWeight = 0;
        for(int i=0; i<UserInputString.length(); i++)
        {
            char c = UserInputString.charAt(i);
            if(Character.isUpperCase(c))
            {
                UpperCharacterWeight += c;
            }
            else{
                LowerCharacterWeight += c;
            }
        }
        int absoluteWeight = UpperCharacterWeight - LowerCharacterWeight;
        System.out.println("absoluteWeight = " + (absoluteWeight>0 ? absoluteWeight : 0));
    }
}
