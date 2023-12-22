import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() == 4) {
            System.out.println("ABD");
        } else {
            System.out.println("ABC");
        }
    }
}