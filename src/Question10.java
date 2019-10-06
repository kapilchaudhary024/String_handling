//WAP to print index of given character ch from inputString.
//
//        input:
//        char ch = 'a';
//        String inputString = "vaibhav";
//
//        output:
//        1


import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String UserInputString = scan.nextLine();

        char ch = 'a';
        System.out.println(UserInputString.indexOf(ch));
    }
}
