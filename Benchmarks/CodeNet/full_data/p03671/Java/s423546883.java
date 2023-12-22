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
        int c = sc.nextInt();

        int max = Math.max(a, b);
        max = Math.max(max, c);

        if (max == a) {
            System.out.println(b + c);
            return;
        }

        if (max == b) {
            System.out.println(a + c);
            return;
        }

        System.out.println(a + b);

    }
}