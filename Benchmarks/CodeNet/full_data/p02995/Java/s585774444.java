import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        long c1 = (a - 1) / c;
        long c2 = b / c;
        long cx = c2 - c1;
        long d1 = (a - 1) / d;
        long d2 = b / d;
        long dx = d2 - d1;
        
        long e = lcm(c, d);
        
        long e1 = (a - 1) / e;
        long e2 = b / e;
        long ex = e2 - e1;
        
        long answer = (b - a + 1) - (cx + dx - ex);
        
        System.out.println(answer);
        
    }
    
    public static long lcm(long m, long n) {
        return m * (n / gcd(m, n));
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        
        return gcd(b, a % b);
    }
}
