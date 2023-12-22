import java.util.Scanner;

public class Main {
    static int mod = 1000000007;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long ans = 0;
        int[] t = new int[k + 1];
        for (int i = 2 ; i <= k ; i++) {
            int a = k / i;
            int b = a / i;
            ans +=(long)  (i - 1)* (pow(a, n) - pow(b, n) + mod) % mod;
            t[i] = pow(a, n) - pow(b, n);
            ans %= mod;
        }

        ans = (long)  (ans + pow(k, n)) % mod;


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