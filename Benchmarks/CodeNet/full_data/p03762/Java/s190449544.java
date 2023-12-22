import java.util.*;

public class Main {
    public static void main(String[] args) {
        final long DIV = 1000000007L;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[m];
        for(int i=0; i<n; i++){
            x[i] = sc.nextLong();
        }
        for(int j=0; j<m; j++){
            y[j] = sc.nextLong();
        }
        sc.close();

        // long[] xmult = new long[n-1];
        long xmultsum = 0;
        for(int i=0; i<n-1; i++){
            // xmult[i] = (x[i+1] - x[i]) * (i+1) * (n-i);
            xmultsum += (x[i+1] - x[i]) * (i+1) * (n-i-1);
            xmultsum %= DIV;
        }
        long ans = 0;
        // long[] ymult = new long[m-1];
        for(int i=0; i<m-1; i++){
            // ymult[i] = (y[i+1] - y[i]) * (i+1) * (m-i);
            ans += xmultsum * (((y[i+1] - y[i]) * (i+1) * (m-i-1)) % DIV);
            ans %= DIV;
        }

        System.out.println(ans);
    }
}