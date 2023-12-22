import java.util.*;

class Main
{
    static long MOD = (long) Math.pow(10, 9) + 7;

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        //Mの素因数分解

        int x = M;
        int[] mm = new int[50];
        Arrays.fill(mm, 0);

        int i = 2;
        int index  = 0;
        while( x > 1){
            if(x % i == 0){
                int count = 0;
                while(x % i == 0){
                    count++;
                    x /= i;
                }
                mm[index] = count;
            }
            else{
                if(mm[index] > 0) index++;
                i++;
            }
        }
        long ans = 1;

        int K = index + 1;

        for(int j = 0; j < K; j++){
            ans *= calComb(N + mm[j] - 1, Math.min(N-1, mm[j]));
            ans %= MOD;
        }
        System.out.println(ans);
    }

    public static long calComb (int n, int m){
        long sumMul = 1;
        long sumDiv1 = 1;
        long sumDiv2 = 1;
        long ans = 1;
        for(int i = 0; i < n; i++){
            sumMul *= i + 1;
            sumMul %= MOD;
        }
        for(int i = 0; i < m; i++){
            sumDiv1 *= (i+1);
            sumDiv1 %= MOD;
        }
        for(int i = 0; i < n - m; i++){
            sumDiv2 *= (i+1);
            sumDiv2 %= MOD;
        }

        ans *= sumMul;
        sumDiv1 = modPow(sumDiv1, MOD - 2);
        ans *= sumDiv1;
        ans %= MOD;
        sumDiv2 = modPow(sumDiv2, MOD - 2);
        ans *= sumDiv2;
        ans %= MOD;
        return ans;
    }
    public static long modPow(long n, long p){
        if(p == 0) return 1;
        else if( p % 2 == 0){
            long halfP = p / 2;
            return (long) ( Math.pow(modPow(n, halfP), 2) )% MOD;
        }
        else{
            return ( n * modPow(n, p - 1) )% MOD;
        }
    }
}