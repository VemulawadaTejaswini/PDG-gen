import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long mod = 1000_000_000 + 7;
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                long tmp = (a[i] ^ a[j]) % mod;
                ans += tmp;
                ans = ans % mod;
            }
        }

        System.out.println(ans);

        sc.close();
    }

}
