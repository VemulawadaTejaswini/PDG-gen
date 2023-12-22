import java.util.*;

public class Main {
    static long INF = 1000000000000000L;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        long tmp1 = b / c;
        long tmp2 = b / d;
        long tmp3 = b / lcm(c, d);
        
        long tmp4 = (a-1) / c;
        long tmp5 = (a-1) / d;
        long tmp6 = (a-1) / lcm(c, d);
        
        long ans = (b-a+1) - ((tmp1 + tmp2 - tmp3) - (tmp4 + tmp5 - tmp6));
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
