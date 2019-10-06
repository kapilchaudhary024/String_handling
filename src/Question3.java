//WAP to accept inputString from user and replace all the vowels by *, by using String replace(char oldChar, char newChar).
//
//        String s1 = "vaibhav";
//        s1 = s1.replace('a','*');
//        System.out.println(s1);
//
//        output:
//        v*ibh*v

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String UserInputString = scan.nextLine().toLowerCase();

        // condition
        char[] Vowel = {'a', 'e', 'i', '0', 'u'};

        for(int i=0; i < 5; i++ )
        {
            UserInputString = UserInputString.replace(Vowel[i], '*');
            //System.out.println(Vowel[i]);
        }
        System.out.println(UserInputString);
    }
}
