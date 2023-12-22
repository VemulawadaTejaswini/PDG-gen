import java.util.*;

class Main {
    //
    static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        for(int i = 1;i <= n;i++){
            if(i < 10||(i >= 100&&i < 1000)||(i >= 10000&&i < 100000)){
                ans++;
            }
        }
        System.out.println(ans);
    }

}