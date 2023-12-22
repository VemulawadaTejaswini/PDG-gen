import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.indexOf("7") != -1)System.out.println("Yes");
        else System.out.println("No");
    }
}