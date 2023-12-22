import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        final int C = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        long ans = 1000000000;
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        long[] sum = new long[3];
        
        sum[0] = A*x + B*y;
        sum[1] = 2 * C * max;
        if (x >= y) {
            sum[2] = 2 * C * min + (max - min) * A;
        } else {
            sum[2] = 2 * C * min + (max - min) * B;
        }
        for (int i = 0; i < 3; i++) {
            ans = Math.min(ans, sum[i]);
        }
        
        out.println(ans);
        
        out.flush();
    }
}