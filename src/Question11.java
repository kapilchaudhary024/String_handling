import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String UserInputString = scan.nextLine();

        System.out.print("Enter a Character : ");
        char ch = scan.next().trim().charAt(0);

        for(int i=0; i<UserInputString.length(); i++)
        {
            if(UserInputString.charAt(i) == ch)
            {
            System.out.println(i);
            }
        }
    }
}
