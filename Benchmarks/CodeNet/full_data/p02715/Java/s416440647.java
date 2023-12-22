import java.util.*;
 
class Main{
    final static long mod = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[k + 1];
        for(int i = 1; i <= k / 2; i++){
            long sub = 0;
            for(int j = 2; j <= i / 2; j++){
                sub = (sub + a[k / j]) % mod;
            }
            a[i] = (pow(i, n) - sub) % mod;
        }
        long ans = 0;
        for(int i = k; i > k / 2; i--){
            ans += i;
        }
        for(int i = k / 2; i >= 1; i--){
            ans = (ans + i * a[k / i]) % mod;
        }
        System.out.println(ans);
    }
    public static long pow(int a, int b){
        long out = 1;
        for(int i = 0; i < b; i++){
            out = out * a % mod;
        }
        return out;
    }
}