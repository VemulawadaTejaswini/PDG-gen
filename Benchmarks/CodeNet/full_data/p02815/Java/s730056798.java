import java.util.*;

public class Main {

    static int mod = 1_000_000_007;
    static long pow(long a,int n) {
        long res=1;
        while (n>0) {
            if ((n-n/2*2)==1) {
                res=res*a%mod;
            }
            a=a*a%mod;
            n>>=1;
        }
        return res;
    }

    static long modinv(long n) {
        return pow(n, mod-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] C = new long[N];
        for (int i=0;i<N;i++) {
            C[i] = Integer.parseInt(sc.next());
        }
        long[] val = new long[N];
        long a = pow(2, N-1);
        long b = pow(2, N-2);
        for (int i=0;i<N;i++) {
            val[i] = (a+b*i%mod)%mod;
        }
        Arrays.sort(C);
        long ans = 0L;
        for (int i=0;i<N;i++) {
            ans = (ans+C[i]*val[N-1-i]%mod)%mod;
        }
        System.out.println(ans*pow(2, N)%mod);
    }
}