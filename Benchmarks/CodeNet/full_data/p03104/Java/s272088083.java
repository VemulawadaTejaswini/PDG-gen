import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a == 0L) {
            System.out.println(xor(b));
            return;
        }
        
        long za = xor(a - 1L);
        long zb = xor(b);
        long ans = za ^ zb;
        System.out.println(ans);
    }
    
    static long xor(long x) {
        if(x % 2L == 1L) {
            long q1 = (x + 1L) / 2L;
            return q1 % 2L;
        }
        
        if(x == 0L) return 0L;
        
        return xor(x - 1L) ^ x;
    }
}
