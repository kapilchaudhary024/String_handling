//WAP to print substring of a given inputString by using String substring(int index).
//        Accept inputString and index from user.



import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String UserInputString = scan.nextLine();
        int UserInputIndex = scan.nextInt();

        System.out.println(UserInputString.substring(UserInputIndex));
    }
}
