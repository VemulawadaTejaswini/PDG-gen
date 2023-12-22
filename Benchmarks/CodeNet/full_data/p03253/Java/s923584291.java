import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mod = 1_000_000_007;
        
        //
        ArrayList<Integer> b = new ArrayList<>();
        int tmp = m;
        for(int i=2; i*i<=m; i++){
            if(tmp%i==0){
                int cnt = 0;
                while(tmp%i==0){
                    cnt++;
                    tmp /= i;
                }
                b.add(cnt);
            }
        }
        if(tmp!=1)b.add(1);
        
        Mod_nCr mn = new Mod_nCr(mod, 200000);
        
        long ans = 1;
        for(int cnt : b){
            //System.out.println("cnt : "+cnt);
            long res = mn.nCr(n+cnt-1, cnt);
            ans *= res;
            ans %= mod;
        }
        
        System.out.println(ans);
        
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

