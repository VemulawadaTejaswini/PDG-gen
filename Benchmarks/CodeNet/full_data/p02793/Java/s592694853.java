import java.util.*;

public class Main {
    static long mod = (long)Math.pow(10,9)+7;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] ans = new long[n];
        Arrays.fill(ans,1L);
        ArrayList<Long> pl = getPrimeList();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        ans = div(a,ans,2L);
        for(Long p : pl){
            ans = div(a,ans,p);
        }
        long prt = 0;
        for(int i = 0; i < n; i++){
            prt += ans[i]%mod;
            prt %= mod;
        }
        System.out.println(prt);
    }
    
    private static long[] div(long[] a, long[] b, long d){
        long[] pow = new long[a.length];
        long max = 0;
        for(int i = 0; i < a.length; i++){
            while(a[i] % d == 0){
                a[i] /= d;
                pow[i]++;
            }
            max = Math.max(max,pow[i]);
        }
        for(int i = 0; i < a.length; i++){
            b[i] *= rep2(d,max-pow[i],mod);
            b[i] %= mod;
        }
        return b;
    }
    
    private static long rep2(long b, long n, long mod){
        if(n == 0) return 1;
        if(n == 1) return b;
        long bn = rep2(b,n/2,mod)%mod;
        if(n % 2 == 0){
            return (long)(bn%mod*bn%mod)%mod;
        }else{
            return (long)(bn%mod*bn%mod)%mod*b%mod;
        }
    }
    
    private static ArrayList<Long> getPrimeList(){
        ArrayList<Long> ret = new ArrayList<Long>();
        for(long i = 3; i <= 100000; i += 2){
            boolean bool = true;
            for(long p : ret){
                if(i % p == 0){
                    bool = false;
                    break;
                }
            }
            if(bool) ret.add(i);
        }
        return ret;
    }
}
