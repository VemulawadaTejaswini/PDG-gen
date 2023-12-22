import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] a = new long[N+1];
        long[] b = new long[N];
        
        for(int i = 0; i < N+1; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        
        for(int i = 0; i < N; i++) {
            b[i] = Long.parseLong(sc.next());
        }
        
        long count = 0;
        
        for(int i = 1; i < N+1; i ++) {
            if(a[i-1] >= b[i-1]) {
                a[i-1] -= b[i-1];
                count += b[i-1];
            }else {
                if(a[i] >= b[i-1] - a[i-1]) {
                    count += b[i-1];
                    a[i] -= b[i-1] - a[i-1];
                    a[i-1] = 0;
                }else {
                    count += a[i-1] + a[i];
                    a[i-1] = 0;
                    a[i] = 0;
                }
            }
            
        }
        
        System.out.println(count);
        
    }
}