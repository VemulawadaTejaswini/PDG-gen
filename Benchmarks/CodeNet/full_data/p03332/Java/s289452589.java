import java.util.*;
 
class Main
{
    static int MOD = 998244353;
 
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        long K = sc.nextLong();
        long ans = 0;
        long[] comb = new long[n+1];
        comb[0] = 1;
        for(int i = 1; i < n+1; i++){
            comb[i] = comb[i-1] * (n - i + 1) / i % MOD;
        }
        long q = K + A;
        for(int x = 0; x <= n; x++){
            q -= A;
            if(q % B == 0){
                long y = q / B;
                if(y > n) continue;
                if(y < 0) break;
                ans = (ans + comb[x] * comb[(int)y] % MOD) % MOD;
            }
        }
        System.out.println(ans);
    }
 }