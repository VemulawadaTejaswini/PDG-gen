import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextLong();
        long[] digit = new long[60];
        for (long a: A) {
            char[] binary = Long.toBinaryString(a).toCharArray();
            for (int i = 0; i < binary.length; i++) {
                digit[i] += (long) (binary[binary.length-1-i] - '0');
            }
        }
        long ans = 0;
        long mod = (long) 1e9+7;
        long pow = 1;
        for (int i = 0; i < 60; i++) {
            ans += digit[i] * (N-digit[i]) * pow % mod;
            ans %= mod;
            pow *= 2;
            pow %= mod;
        }
        System.out.println(ans);
    }
}
