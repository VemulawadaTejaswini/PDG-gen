import java.util.*;

public class Main {

    static long mod = 1_000_000_007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(max < a[i]) max = a[i];
        }
        int k = (int)Math.sqrt(max) + 1;
        int[] d = new int[max];
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int c = 2;
            int[] b = new int[max];
            while(1 < x){
                while(x % c == 0){
                    b[c]++;
                    x /= c;
                }
                if(d[c] < b[c]) d[c] = b[c];
                c++;
                if(k <= c)break;
            }
            if(1 < x){
                b[x]++;
                if(d[x] < b[x]) d[x] = b[x];
            }
        }
        long ans = 0L;
        for (int i = 0; i < n; i++) {
            long lcm = 1L;
            int x = a[i];
            for (int j = 2; j < max; j++) {
                for (int e = 0; e < d[j]; e++) {
                    if(x % j == 0) x /= j;
                    else lcm = (lcm * j)%mod;
                }
            }
            ans = (ans + lcm) %mod;
        }
        System.out.println(ans);
        sc.close();

    }


}
