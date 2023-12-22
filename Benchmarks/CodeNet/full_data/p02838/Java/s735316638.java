import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long mod = 1000_000_000 + 7;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long ans = 0;
        for (int i = 0; i < 60; i++) {
            int countZero = 0;
            int countOne = 0;
            for (int j = 0; j < n; j++) {
                if ((a[j] >> i) % 2 == 1) {
                    countOne++;
                } else {
                    countZero++;
                }
            }
            long tmp = (((power(i) % mod) * countOne % mod) * countZero) % mod;
            // System.out.println(power(i) + ":" + countOne + ":" + countZero + ":" + tmp);
            ans += tmp;
            ans = ans % mod;
        }

        System.out.println(ans);

        sc.close();
    }

    static long power(int num) {
        long ret = 1;
        for (int i = 0; i < num; i++) {
            ret *= 2;
        }
        return ret;
    }
}
