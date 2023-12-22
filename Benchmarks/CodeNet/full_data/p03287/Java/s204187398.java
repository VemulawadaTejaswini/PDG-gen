import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    static boolean succeeded;
    static long[] dp;
    static long[] end;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextInt();
        long[] a = new long[n];
        dp = new long[n];
        end = new long[n];
        for (int i = 0; i < a.length; ++i) {
            a[i] = scanner.nextInt() % m;
            dp[i] = -1;
        }
        for (int i = 0;i < a.length;++i){
            dp[i] = search(a,m,i);
        }
        long ret = 0;
        for (int i = 1;i < dp.length;++i){
            if(dp[i] >= 0)ret += dp[i] * end[i - 1] + 1;
        }
        System.out.println(ret);
    }

    public static long search(long[] a,long m,int p){
        long k = 0;
        if(p >= a.length - 1)return 0;
        if(dp[p] >= 0)return dp[p];
        for (int j = p;j < a.length;++j){
            k += a[j];
            if(k % m == 0){
                ++end[j];
                if(j + 1 < a.length){
                    dp[j + 1] = search(a,m,j + 1);
                }
                else return 1;
                return dp[j + 1] + 1;
            }
        }
        return 0;
    }


}
