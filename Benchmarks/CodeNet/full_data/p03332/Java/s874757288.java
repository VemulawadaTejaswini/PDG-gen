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
        int K = sc.nextInt();
        long ans = 0;
        for(int i = 0; A * i <= K; i++){
            if((K - A * i) % B == 0){
                int x = i; 
                int y = (K - A * x) / B;
                ans = (ans + calc(n, x) * calc(n, y) % MOD) % MOD;
            }
        }
        System.out.println(ans);
    }
    public static long calc(int n, int a)
    {
        int MulSumN = 1;
        int MulSumA = 1;
        for(int i = 1; i <= a; i++){
            MulSumN *= n - i + 1;
            MulSumN %= MOD;
            MulSumA *= i;
            MulSumA %= MOD;
        }
        return MulSumN * pow(MulSumA, MOD - 2) % MOD;
    }
    public static long pow(int a, int b){
        if(b == 1) return a;
        if(b % 2 == 0){
            long d = pow(a, b / 2);
            return d * d % MOD;
        }
        return a * pow(a, b - 1) % MOD;
    }
}