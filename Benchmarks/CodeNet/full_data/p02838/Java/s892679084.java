import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(sc.next());
        }

        long mod = 1000000007;
        long ans = 0;
        long base = 1;
        for (int i = 0; i <= 60; i++) {
            long zeroNum = 0;
            long oneNum = 0;

            for (int j = 0; j < N; j++) {
                int bit = (int)((A[j] >> i) & 1);

                if (bit == 0) {
                    zeroNum++;
                } else {
                    oneNum++;
                }
            }

            ans += base * (oneNum * (zeroNum % mod) % mod) % mod;
            ans %= mod;
            base *= 2;
        }

        System.out.println(ans);
    }
}
