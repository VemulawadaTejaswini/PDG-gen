import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] as = new long[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }

        long ans = 0;
        for (int i = 0; i <= 1000000; i++) {
            long tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += i % as[j];
            }
            ans = Math.max(ans, tmp);
        }

        System.out.println(ans);
    }
}