import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] a = new long[N];
        a[0] = Long.parseLong(sc.next());
        long min = a[0];
        for(int i=1; i<N; i++) {
            a[i] = Long.parseLong(sc.next());
            if(min > saiyaku(a[i-1], a[i]))  min = saiyaku(a[i-1], a[i]);
        }
        
        System.out.println(min);
    }
    
    static long saiyaku(long a, long b) {
        if(a < b) return saiyaku(b, a);
        if(b == 0) {
            return a;
        }else {
            long w = b;
            a = a % b;
            b = w;
            return saiyaku(a, b);
        }
    }
}