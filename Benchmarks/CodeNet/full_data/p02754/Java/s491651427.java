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
        String s;
        int n,m;
        int[] ary;
        n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        while(n > 0){
            if(n < a){
                ans += n;
                break;
            }
            ans += a;
            n -=a+b;
        }
        System.out.println(ans);
        
    }
}

