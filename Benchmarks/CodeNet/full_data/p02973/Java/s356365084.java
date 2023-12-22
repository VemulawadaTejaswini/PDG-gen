import java.util.*;
import java.math.*;
class Main {
    //
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt();
        }
        int ans = 0;
        boolean[] check = new boolean[n];
        for(int i = 0;i < n;i++){
            int tmp = -1;
            if(check[i])continue;
            ans++;
            for(int j = i;j < n;j++){
                if(tmp < ary[j]){
                    tmp = ary[j];
                    ary[j] = -2;
                    check[j] = true;
                }
            }
        }
        System.out.println(ans);
    }
}