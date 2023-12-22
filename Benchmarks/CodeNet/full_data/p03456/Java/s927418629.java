import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        String a = sc.next();
        String b = sc.next();
        int n = Integer.parseInt(a + b);
        for (int i = 0; i < Math.sqrt(n + 1); i++) {
            if (n == i * i) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}