import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n == 1 || n % 2 == 1) {
            System.out.println(((n / 2) + 1 >= k) ? "YES" : "NO");
        } else {
            System.out.println((n / 2 >= k) ? "YES" : "NO");
        }
    }
}
