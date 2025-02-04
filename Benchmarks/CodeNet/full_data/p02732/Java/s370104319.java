import java.util.*;
import java.math.*;
public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        int[] count = new int[n+1];
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt();
            count[ary[i]]++;
        }
        long ans = 0;
        for(int i = 0;i < n+1;i++){
            long tmp = count[i];
            tmp *= count[i]-1;
            tmp /=2;
            ans+= tmp;
        }
        for(int i = 0;i < n;i++){
            System.out.println(ans-count[ary[i]]+1);
        }

    }       
}




