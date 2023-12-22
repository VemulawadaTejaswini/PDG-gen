import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        int mod = 1_000_000_007;
        Mod_nCr mn = new Mod_nCr(mod, 220000);
        
        long ans = 0L;
        for(int i=b+1; i<=w; i++){
            long x = mn.nCr(h-a+i-2, i-1);
            long y = mn.nCr(a-1+w-i, w-i);
            ans += ((x%mod)*(y%mod))%mod;
        }
        
        System.out.println(ans%mod);
    }
}

class Mod_nCr{
    int mod;
    long[] fact;
    long[] rfact;
    
    public Mod_nCr(int mod, int max){
        this.mod = mod;
        fact = new long[max];
        rfact = new long[max];
        
        fact[0] = 1;
        rfact[0] = 1;
        
        for(int i=1; i<max; i++){
            fact[i] = (fact[i-1]*i)%mod;
            rfact[i] = mod_inverse(fact[i], mod);
        }
    }
    
    //
    private long mod_pow(long x, long p, long m){
        long a = 1;
        while(p>0){
            if(p%2==1){
                a = a*x%m;
            }
            x = x*x%m;
            p /= 2;
        }
        return a;
    }
    
    private long mod_inverse(long a, long m){
        return mod_pow(a, m-2, m);
    }
    
    //
    public long nCr(int n, int r){
        return fact[n]*rfact[r]%mod * rfact[n-r]%mod;
    }
}

