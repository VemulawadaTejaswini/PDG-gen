import java.util.Scanner;

public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int[] cnt = new int[1000007];
        for (int x : a) {
            for (int d = 2 ; d * d <= x ; d++) {
                int c = 0;
                while (x % d == 0) {
                    c++;
                    x /= d;
                }
                cnt[d] = Math.max(cnt[d], c);
            }
            if (x > 1 && cnt[x] == 0) {
                cnt[x] = 1;
            }
        }
        long lcm = 1;
        for (int i = 1 ; i < cnt.length ; i++) {
            lcm = lcm * pow(i, cnt[i]) % mod;
        }
        int ans = 0;
        for (int x : a) {
            ans += lcm * pow(x, mod - 2) % mod;
            ans %= mod;
        }
        System.out.println(ans);

    }

    static int pow (long b, int e) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1) {
                ans = ans * b % mod;
            }
            e >>= 1;
            b = b * b % mod;
        }
        return (int) ans;
    }

}