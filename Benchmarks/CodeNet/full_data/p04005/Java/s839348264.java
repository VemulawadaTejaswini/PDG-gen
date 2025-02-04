import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println(0);
            return;
        }

        long ans = (a * b * c) / Math.max(a, Math.max(b, c));
        System.out.println(ans);
    }
}