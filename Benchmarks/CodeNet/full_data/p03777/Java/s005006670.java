import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String a = sc.next();
        String b = sc.next();

        if (a.equals("H") && b.equals("H")) {
            System.out.println("H");
            return;
        } else if (a.equals("H") && b.equals("D")) {
            System.out.println("D");
            return;
        }

        if (b.equals("H")) {
            System.out.println("D");
            return;
        } else {
            System.out.println("H");
        }
    }
}