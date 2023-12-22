import java.util.*;

 

class Main {
    static int mod = (int) 1e9 + 7;
    static long factorials[];
    static long factorialDivs[];

    static void pre_factrials(int n) {
        factorials = new long[n + 1];
        factorialDivs = new long[n + 1];//割算の結果を格納する配列
        factorials[0] = 1;
        for (int i = 0; i < n; i++) {
            factorials[i + 1] = mul(i + 1, factorials[i]);
        }
        factorialDivs[n] = div(1, factorials[n]);//最初に1/(n!)を求める事で、1/(n-1)!からは掛け算で求める事ができる。
        for (int i = n - 1; i >= 0; i--) {
            factorialDivs[i] = mul(factorialDivs[i + 1], i + 1);
        }
    }

    static long fastFermatComb(int a, int b) {
        if (factorials.length == 0)
            System.err.println("error : factorials has not been culculated!! do [pre_factorial] method");
        long af = factorials[a];
        long bf = factorialDivs[b];
        long abf = factorialDivs[a - b];
        long res = mul(mul(af, bf), abf);
        return res;
    }

    static long plus(long x, long y) {
        x %= mod;
        y %= mod;
        long res = (x + y) % mod;
        return res;
    }

    static long sub(long x, long y) {
        x %= mod;
        y %= mod;
        long res = (x - y + mod) % mod;
        return res;
    }

    static long mul(long x, long y) {
        x %= mod;
        y %= mod;
        long res = x * y % mod;
        return res;
    }

    static long div(long x, long y) {
        x %= mod;
        y %= mod;
        long res = x * modpow(y, mod - 2) % mod;
        return res;
    }

    static long modpow(long a, long p) {
        if (p == 0)
            return 1;
        if (p % 2 == 0) {
            long halfP = p / 2;
            long root = modpow(a, halfP);
            return root * root % mod;
        } else
            return a * modpow(a, p - 1) % mod;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        pre_factrials(n);
        int ans = 1;
        for(int i=1; i<=n; i++){
            if(i != a && i != b){
                ans = (ans*(int)fastFermatComb(n,i))%mod;
            }
        }
        System.out.println(ans);
    }

}