import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

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
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[][] b = new int[n][k];
        int[] d = new int[k];
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int c = 2;
            while(1 < x){
                while(x % c == 0){
                    b[i][c]++;
                    x /= c;
                }
                if(d[c] < b[i][c]) d[c] = b[i][c];
                c++;
                if(k <= c)break;
            }
            if(1 < x){
                map.put(i, x);
            }
        }
        long ans = 0L;
        for (int i = 0; i < n; i++) {
            long lcm = 1L;
            for (int j = 2; j < k; j++) {
                lcm = (lcm * modPow((long)j, d[j] - b[i][j])) % mod;
                for (int e = 0; e < d[j] - b[i][j]; e++) {
                     lcm = (lcm * j)%mod;
                }
            }
            for(Entry<Integer, Integer> f : map.entrySet()){
                if(!map.containsKey(i) || f.getValue().intValue() != map.get(i).intValue()){
                    lcm = (lcm * f.getValue());
                }
            }
            ans = (ans + lcm) %mod;
        }
        System.out.println(ans);
        sc.close();

    }

    private static long modPow(long base, int exp) {
        long ret = 1;
        while(exp > 0){
            if((exp & 1) == 1){
                ret = ret * base %mod;
            }
            base = base * base %mod;
            exp >>= 1;
        }
        return ret;
    }

}
