import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] as = new long[n];
        long[] bs = new long[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextLong();
            bs[i] = sc.nextLong();
        }

        long ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            long r = (as[i] + ans) % bs[i];
            ans += (as[i] + ans) < bs[i] ? bs[i] - (as[i] + ans) : bs[i] - r;
        }
        System.out.println(ans);
    }
}
