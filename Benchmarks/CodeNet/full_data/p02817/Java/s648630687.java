import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String s1 = input.nextLine();
        System.out.println("Enter the String 2: ");
        String s2 = input.nextLine();
        System.out.println(s2+s1);
    }
}
