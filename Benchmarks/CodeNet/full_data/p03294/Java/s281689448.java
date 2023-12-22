import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        
        long l = array[0];
        for (int i = 1; i < n; i++) {
            l = lcm(l, array[i]);
        }
        l--;
        
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += l % array[i];
        }
        
        System.out.println(ans);
    }
    
    public static long lcm(long m, long n) {
        return m * (n / gcd(m, n));
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        
        return gcd(b, a % b);
    }
}