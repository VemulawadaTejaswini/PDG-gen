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
        int c = sc.nextInt();
        int k = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int ans = a + b + c - max;
        for (int i = 0; i < k; i++) {
            max *= 2;
        }
        System.out.println(ans +max);
    }
}