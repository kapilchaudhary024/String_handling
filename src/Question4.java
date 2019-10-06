//Modify the above program so that:
//
//        1.first occurred vowel will be replaced by *.
//        2.Second occurred vowel will be replaced by ^.
//        3.Third occurred vowel will be replaced by !.
//        repeat the question3 for all occurred vowels.



import java.util.Arrays;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String UserInputString = scan.nextLine().toLowerCase();

        char[] UserArray = UserInputString.toCharArray();
        //System.out.println((UserArray));
        int x = 0;
        for (int i = 0; i < UserInputString.length(); i++) {
            if (UserArray[i] == 'a' || UserArray[i] == 'e' || UserArray[i] == 'i' || UserArray[i] == 'u') {
                x++;
                if (x == 1) {
                    UserArray[i] = '*';
                }
                if (x == 2) {
                    UserArray[i] = '^';
                }
                if (x == 3) {
                    UserArray[i] = '!';
                }
            }
        }
        System.out.println(UserArray);
    }
}