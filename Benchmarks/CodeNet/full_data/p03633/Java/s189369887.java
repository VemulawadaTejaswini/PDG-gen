import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = 0;
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
            if (m < array[i]) {
                m = array[i];
            }
        }
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = lcm(ans, array[i]);
        }
        if (ans < m) {
            ans = m;
        }
        System.out.println(ans);
    }
    
    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static long lcm(long a, long b) {
        return a/gcd(a,b)*b;
    }
}
