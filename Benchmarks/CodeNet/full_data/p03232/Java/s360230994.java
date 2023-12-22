import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int mod = 1_000_000_007;
        
        long kotei = 1;
        long go = 1;
        long humei = 1;
        long are = 0;
        
        for(int i=0; i<n; i++){
            kotei *= i+1;
            kotei %= mod;
            
            if(i>1){
                humei += go;
                go *= 5;
                humei %= mod;
                go %= mod;
            }
            
            are += humei*i;
            are %= mod;
            //System.out.println(i + "  " +  humei);
        }
        
        
        long x = (kotei + are)%mod;
        
        Mod_nCr mn = new Mod_nCr(mod, 100005);
        
        long ans = 0;
        
        for(int i=0; i<n; i++){
            long tmp = mn.nCr(n, i+1);
            //System.out.println(n + " " + i + " " +tmp);
            long y = (tmp + x)%mod;
            ans += (a[i] * y)%mod;
            ans %= mod;
        }
        
        System.out.println(ans);
        
    }
}


//インスタンス作るだけでO(max)掛かるよ
//更に定数倍きついよ

class Mod_nCr{
    int mod;
    long[] fact;
    long[] rfact;
    
    public Mod_nCr(int mod, int max){
        this.mod = mod;
        fact = new long[max];
        rfact = new long[max];
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
