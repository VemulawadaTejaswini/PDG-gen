import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a * b <= 0) {
            System.out.println("Zero");
            return;
        }

        if (a > 0) {
            System.out.println("Positive");
            return;
        }

        if ((b - a) % 2 == 1) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}