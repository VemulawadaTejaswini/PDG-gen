import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Draw");
            return;
        }

        if (a == 1) {
            System.out.println("Alice");
            return;
        }

        if (b == 1) {
            System.out.println("Bob");
            return;
        }

        System.out.println(a > b ? "Alice" : "Bob");
    }
}