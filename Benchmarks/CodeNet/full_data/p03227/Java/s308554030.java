import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.length() == 2) {
            System.out.println(str);
        } else {
            System.out.print(str.charAt(2));
            System.out.print(str.charAt(1));
            System.out.print(str.charAt(0));
            System.out.println();
        }

    }
}