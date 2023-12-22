import java.util.*;

public class Main {
    
    static long gcd = 0;
    
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lg = sc.nextInt();
        long ans = 0;
        
        if (lg == 1) {
            ans = sc.nextLong();
        } else {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (x < y) {
                long z = x;
                x = y;
                y = z;
                GCD(x, y);
                ans = LCM(x, y, gcd);
            }
        }
        
        for (int i = 2; i < lg; i++) {
            long x = sc.nextLong();
            if (ans % x != 0) {
                if (x % ans == 0) {
                    ans = x;
                } else {
                if (ans < x) {
                    long y = x;
                    x = ans;
                    ans = y;
                }
                    GCD(ans, x);
                    ans = LCM(ans, x, gcd);
                }
            }
        }
        
        System.out.println(ans);
        
    }
    
    // a と bの最小公倍数
    public static long LCM(long a, long b, long x) {
        return  a * b / x;
    }
    
    // a > bでaとbの最小公倍数
    public static void GCD(long a, long b) {
        if (a % b == 0) {
            gcd = b;
        } else {
            GCD(b, a % b);
        }
    }
}