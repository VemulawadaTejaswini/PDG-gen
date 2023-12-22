import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        long[] a = new long[N+1];
        long[] b = new long[N];
        for (int i = 0; i < N + 1; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        for (int i = 0; i < N; i++) {
            b[i] = Long.parseLong(sc.next());
        }
        long ans = 0;
        
        for (int i = 0; i < N; i++) {
            if (a[i] >= b[i]) {
                ans += b[i];
            } else if (a[i] < b[i] && a[i+1] >= b[i] - a[i]) {
                ans += b[i];
                a[i+1] -= (b[i] - a[i]);
            } else if (a[i] < b[i] && a[i+1] < b[i] - a[i]) {
                ans += (a[i] + a[i+1]);
                a[i+1] = 0;
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}