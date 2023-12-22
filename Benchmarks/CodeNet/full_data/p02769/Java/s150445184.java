import java.util.Scanner;

public class Main {
    static int MAX_FAC = 400001;
    static long FAC[] = new long[MAX_FAC];
    static long INV_FAC[] = new long[MAX_FAC];
    private static long MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans=0;
        initFAC();
        if(k==1){
            ans = (n*(n-1)) % MOD;
        }else{
            for(long i=1;i<=Math.min(k, n-1);i++){
                //System.out.println(bara((int)n, (int)(n-i)) + ":" + comb((int)n, (int)i));
                ans += ((bara((int)n, (int)(n-i)) * comb((int)n, (int)i)) % MOD);
                ans %= MOD;
            }
            ans ++;
            ans %= MOD;
        }
        System.out.println(ans);
    }
    static long comb(int n, int k){
        return (((FAC[n] * INV_FAC[n-k]) % MOD) * INV_FAC[k]) % MOD;
    }

    static void initFAC(){
        FAC[0]=1;
        INV_FAC[0] = modinv(FAC[0]);
        for(int i=1;i<MAX_FAC;i++){
            FAC[i]=(i*FAC[i-1]) % MOD;
            INV_FAC[i] = modinv(FAC[i]);
        }
    }
    static long modpow(long a, long b){
        if(b == 1){return a % MOD;}
        if(b == 0){return 1;}
        long res = b/2;
        long rem = b%2;
        long p = modpow(a, res) % MOD;
        if(rem == 1){
            return (((p*p) % MOD) * a) % MOD;
        }else{
            return (p*p) % MOD;
        }
    }

    static long modinv(long a){
        return modpow(a, MOD-2);
    }

    private static long bara(int n, int k){
        return comb(n-1, k-1);
    }

}
