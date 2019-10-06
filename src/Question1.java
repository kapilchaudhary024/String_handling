//WAP to print any given inputString in following format.
//
//        Output
//
//        index:  0    1   2   3   4
//        chars:  H    e   l   l   o
//
//        Every character is seprated by tab, use "\t" for inserting tab



import java.util.Scanner;
public class Question1 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String UserInput = scan.nextLine();

        System.out.print("index:");
        for(int i=0; i<UserInput.length(); i++ )
        {
            System.out.print("\t" + i );
        }
        System.out.println();
        System.out.print("chars:");
        for(int j=0; j<UserInput.length(); j++)
        {
            System.out.print("\t" +UserInput.charAt(j));
        }
    }

}
