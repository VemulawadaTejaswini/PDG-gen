import java.util.*;

public class Main {

// global
static long fact[];
static long inverse[];
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

static long comb(int n,int k){
    if(n<0 || k<0 || n<k)return 0;
    return fact[n]*(inverse[k]*inverse[n-k]%mod) %mod;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // main method
        fact=new long[3000005];
        fact[0]=1;
        inverse=new long[3000005];
        inverse[0]=1;
        for(int i=1;i<3000005;i++){
            fact[i]=(fact[i-1]*(long)i)%mod;
            inverse[i]=modinv(fact[i]);
        }

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        long ans = 0L;
        for (int i=r1;i<r2+1;i++) {
            ans = (ans+comb(i+c2+1, c2)-comb(i+c1, c1-1))%mod;
        }
        System.out.println(ans);
    }
}
