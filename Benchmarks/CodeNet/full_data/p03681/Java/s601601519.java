import java.util.*;

public class Main{
    final int MOD = 1000000007;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if(Math.abs(n - m) >= 2){
            System.out.println(0);
            return;
        }
        long out = 1;
        for(int i = 2; i <= n; i++){
            out *= i;
            if(out > MOD) out %= MOD;
        }
        for(int i = 2; i <= m; i++){
            out *= i;
            if(out > MOD) out %= MOD;
        }
        System.out.println((out % MOD) * 2 % MOD);
    }


    public static void main(String[] args){
        new Main().solve();
    }
}
