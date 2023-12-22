import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        final int MOD = (int) 1e9 + 7;
        long ans = 0;
        for (int i = k; i <= n + 1; i++) {
            long b = (i - 1L) * i / 2L;
            long a = (n * (n + 1L) / 2L) - ((n - i) * (n - i + 1L) / 2L);
            ans += a - b + 1L;
            ans %= MOD;
        }
        System.out.println(ans);
    }
}