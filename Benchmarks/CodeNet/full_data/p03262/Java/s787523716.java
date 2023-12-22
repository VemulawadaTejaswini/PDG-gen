import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long x = Long.parseLong(sc.next());
        long[] y = new long[n];
        long[] dif = new long[n];
        for(int i=0; i<n; i++) {
            y[i] = Long.parseLong(sc.next());
            dif[i] = zettai(x, y[i]);
        }
        
        long ans;
        if(n == 1) {
            ans = dif[0];
        }else {
            ans = saiyaku(dif[0], dif[1]);
            for(int i=2; i<n; i++) {
                if(ans > saiyaku(dif[i], dif[i-1])) {
                    ans = saiyaku(dif[i], dif[i-1]);
                }
            }
        }
        System.out.println(ans);
        
    }
    
    static long zettai(long a, long b) {
        if(a <= b) return b-a;
        else return a-b;
    }
    
    static long saiyaku(long a, long b) {
        if(a < b) {
            return saiyaku(b, a);
        }else {
            long w = b;
            if(b == 0) {
                return a;
            }else {
                b = a % b;
                a = w;
                return saiyaku(a, b);
            }
        }
    }
}
