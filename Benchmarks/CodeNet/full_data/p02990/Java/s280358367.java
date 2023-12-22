import java.util.*;
import java.io.*;

class Combination{
    static int MAX = 3000;
    static int MOD = 1000000007;

    static long[] fac = new long[MAX];    //iまでの階乗
    static long[] inv = new long[MAX];    //iの逆元
    static long[] finv = new long[MAX];   //iまでの逆元の階乗
    
    public static long calculate(int n, int k){
        fac[0] = finv[0] = 1;
        fac[1] = finv[1] = 1;
        inv[1] = 1;

        for(int i = 2; i < MAX; i++){
            fac[i] = fac[i-1] * i % MOD;
            inv[i] = MOD - (MOD / i) * inv[MOD % i] % MOD;    //p = (p/a) * a + (p % a) (プログラミングの意味で)が成り立つから両辺mod pをとってa^-1が導ける。
            finv[i] = finv[i-1] * inv[i] % MOD;
        }

        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;    // nCk = n! * (k!)^-1 * ((n-k)!)^-1
    }   

}



public class Main{
    static int INFTY=Integer.MAX_VALUE;
    static int MOD = 1000000007;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
            
        int n = sc.nextInt();
        int k = sc.nextInt();
            for(int i=1;i<=k;i++){
                long ans=Combination.calculate(n-k+1, i) * Combination.calculate(k-1, i-1) % MOD;
                System.out.println(ans);
            }
    }


}