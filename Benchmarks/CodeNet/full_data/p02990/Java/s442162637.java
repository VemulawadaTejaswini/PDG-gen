import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int mod = 1000000007;
        for(int i=1;i<=k;i++){
            if(n-k+1<i){
                System.out.println(0);
            }else{
                long blue = nCkMod(k-1, i-1, mod);
                long red = nCkMod(n-k+1, i, mod);
                System.out.println((blue*red)%mod);
            }
        }
        sc.close();
    }

    public static long getPowMod(long a, long x,long mod){
        long res = 1;
        while(x > 0){
            if((x&1)==1){
                res = (res*a)%mod;
            }
            x>>=1;
            a = (a*a)%mod;
        }
        return res;
    }
    public static long getFactorialMod(long n,long mod){
        if(n==0){
            return 1;
        }else{
            return (n*getFactorialMod(n-1, mod))%mod;
        }
    }

    public static long nCkMod(long n,long k,long mod){
        if(n < k){
            return 0;
        }else{
            long nMod = getFactorialMod(n, mod);
            long kinvMod = getPowMod(getFactorialMod(k, mod), mod-2, mod);
            long n_kinvMod = getPowMod(getFactorialMod(n-k, mod), mod-2, mod);
            long x = (nMod*kinvMod)%mod;
            return (x*n_kinvMod)%mod;
        }
    }

}