import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    // static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    static long[] fact = new long[100];
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ary = new int[n];
        int[] zo = new int[2];
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt()%2;
            zo[ary[i]]++;
        }
        if(k==1&&zo[1]==0){
            System.out.println(0);
            return;
        }
        if(k==0&&zo[1]==0){
            System.out.println(pow(2,n));
            return;
        }
        System.out.println(pow(2,n-1));
    }
    static long pow(long a, long n) {
        long ans = 1;
        long m = n;
        while (m > 0) {
            if ((m & 1) == 1)
                ans = ans * a;
            a = a * a;
            m >>= 1;
        }
        return ans;
    }
    
}
