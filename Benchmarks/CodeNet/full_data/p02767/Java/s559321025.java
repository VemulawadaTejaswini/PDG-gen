import java.util.*;
import java.math.*;
class Main {
    //
    static final long MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0;i < n; i++){
            ary[i] = sc.nextInt();
        }
        Arrays.sort(ary);
        int ans = MAX;
        for(int i = 0;i < 100;i++){
            int l = 0;
            for(int j = 0;j < n;j++){
                l += (ary[j] - i)*(ary[j] - i);
            }
            if(ans > l)ans = l;
        }

        
        System.out.println(ans);

    }
}