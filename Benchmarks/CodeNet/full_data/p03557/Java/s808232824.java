import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[n];
        long ans = 0;
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        for (int i = 0; i < n; i++) b[i] = sc.nextLong();
        for (int i = 0; i < n; i++) c[i] = sc.nextLong();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int cidx = 0;
        long[] sum = new long[n];
        for (int i = 0; i < n; i++) {
            while(cidx < n && b[i] >= c[cidx]) cidx++;
            sum[i] = n - cidx;
            if(i != 0) sum[i] += sum[i - 1];
        }
        int bidx = 0;
        for (int i = 0; i < n; i++) {
            while(bidx < n && a[i] >= b[bidx]) bidx++;
            if(bidx == n) break;
            ans += sum[n-1];
            if(bidx != 0) ans -=  sum[bidx-1];
        }

        System.out.println(ans);
        sc.close();
    }

}
