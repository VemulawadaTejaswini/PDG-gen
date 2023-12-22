import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    // static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        for(int i = k;i <= n+1;i++){
            //i個選ぶことを考える
            long tmp = n;
            tmp*=i;
            tmp++;
            long sub = i-1;
            sub*=i;
            tmp-=sub;
            tmp%=MOD;
            ans+=tmp;
            ans%=MOD;
            //System.out.println(tmp);
        } 
        System.out.println(ans%MOD);

    }

}
