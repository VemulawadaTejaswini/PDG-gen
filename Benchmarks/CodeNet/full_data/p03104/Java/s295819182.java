import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = a;
        for (long i = a + 1; i <= b; i++) {
            ans ^= i;
        }
        System.out.println(ans);
    }
}
