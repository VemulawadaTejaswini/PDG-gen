import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] T = new long[N];
        for (int i = 0; i < N; i++) {
            T[i] = sc.nextLong();
        }
        long now = T[0];
        for (int i = 0; i < N-1; i++) {
            long mod = gcd(now, T[i+1]);
            now = now/mod*T[i+1];
        }
        System.out.println(now);
    }
    
    private static long gcd(long a, long b) {
        long mod = a%b;
        long retval = 0;
        if (mod == 0) {
            retval = b;
        } else {
            retval = gcd(b, mod);
        }
        return retval;
    }
}