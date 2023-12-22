import java.util.Scanner;

public class Main {

    static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sq = (int) Math.ceil(Math.sqrt(M));
        boolean[] c = new boolean[sq+1];
        int prime = 0;
        long ans = 1;
        Combination comb = new Combination(N + sq, MOD);
        for(int i = 2; i <= sq; i++){
            if(c[i]) continue;
            if(M%i == 0){
                prime = 0;
                while(M%i == 0){
                    prime++;
                    M /= i;
                }
                ans = (ans * comb.comb(N-1+prime, Math.min(N-1, prime))) %MOD;
            }
            int a = i;
            int b = 2;
            while(a <= sq){
                c[a] = true;
                a *= b;
                b++;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}

class Combination {

    long fac[]; // factorial:階乗
    long inv[]; // inverse:逆元（ここでは、fac[i]をMOD-2乗したものをMODで割った余り）
    int MOD;

    Combination(int size, int mod){
        this.fac = new long[size +1];
        this.inv = new long[size +1];
        this.MOD = mod;

        this.fac[0] = 1;
        this.inv[0] = 1;

        for(int i = 1; i <= size; i++){
            fac[i] = (fac[i -1] * i) %MOD;
            inv[i] = modPow(fac[i], (int)MOD -2) %MOD;
        }
    }

    /*
     * n個の中からr個選ぶ組み合わせの数 nCr をMODで割った余りを算出する
     */
    long comb(int n, int r){
        return fac[n] * inv[r] %MOD * inv[n - r] %MOD;
    }

    /*
     * base^exp をMODで割った余りを算出する
     * 計算量：O(log(exp))
     */
    private long modPow(long base, int exp) {
        long ret = 1;
        while(exp > 0){
            if((exp & 1) == 1){
                ret = ret * base %MOD;
            }
            base = base * base %MOD;
            exp >>= 1;
        }
        return ret;
    }

}
