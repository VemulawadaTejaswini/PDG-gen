import java.util.*;

class Main{
    public static final int MOD = 1000000007;

    Main(){
        int N, A, B;

        Scanner SC = new Scanner(System.in);
        N = SC.nextInt();
        A = SC.nextInt();
        B = SC.nextInt();

        long R = modpow(2, N)-1;
        R = (R - C(N,A))%MOD;
        if(R < 0) R += MOD;
        R = (R - C(N,B))%MOD;
        if(R < 0) R += MOD;

        System.out.println(R);
    }

    public static void main(String[] args){
        Main main = new Main();
    }

    long modpow(long a, long b){
        long R = 1L;

        a %= MOD;
        while(b > 0){
            if( (b & 1) == 1)
                R = (R * a) % MOD;
            a = (a * a) % MOD;
            b = b >> 1;
        }
        return R;
    }

    long C(long n, long r){
        if(n < r) return 0;
        if(r == 0) return 1;;

        long numer = 1, denom = 1;
        for(long i=n-r+1;i<=n;i++){
            numer = numer * (i % MOD) % MOD;
        }

        for(long i=1;i<=r;i++){
            denom = denom * modinv(i % MOD) % MOD;
        }

        return numer * denom % MOD;
    }

    long modinv(long a){
        return modpow(a, MOD-2);
    }
}
