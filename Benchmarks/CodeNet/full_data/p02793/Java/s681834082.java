import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        Sieve sieve = new Sieve(1000001);
        boolean[] alreadyCount = new boolean[1000002];
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int a : arr){
            HashMap<Integer,Integer> tmp = Sieve.factor(a);
            for(Map.Entry<Integer,Integer> e : tmp.entrySet()){
                int k = e.getKey();
                int v = e.getValue();
                if(alreadyCount[k]){
                    map.put(k,Math.max(map.get(k), v));
                }else{
                    map.put(k,v);
                    alreadyCount[k] = true;
                }
            }
            
        }
        long lcm = 1;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int k = e.getKey();
            int v = e.getValue();
            for(int i = 0; i < v; i++){
                lcm *= k;
                lcm %= mod;
            }
        }
        long ans = 0;
        for(int a : arr){
            long la = a;
            ans += (lcm * rep2(la,mod-2,mod))%mod;
            ans %= mod;
        }
        System.out.println(ans%mod);
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
    
}

class Sieve{
    static int n;
    static int[] f;
    static ArrayList<Integer> prime;
    public Sieve(int n){
        long ln = n;
        prime = new ArrayList<Integer>();
        f = new int[n+1];
        f[0] = f[1] = -1;
        for(int i = 2; i <= n; i++){
            if(f[i] != 0){
                continue;
            }
            f[i] = i;
            prime.add(i);
            long li = (long)i;
            for(long j = li*li; j <= ln; j += li){
                if(f[(int)j] == 0){
                    f[(int)j] = i;
                }
            }
        }
    }
    
    public static boolean isPrime(int x){
        return f[x] == x;
    }
    
    public static ArrayList<Integer> factorList(int x){
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(x != 1){
            res.add(f[x]);
            x /= f[x];
        }
        return res;
    }
    
    public static HashMap<Integer,Integer> factor(int x){
        ArrayList<Integer> fl = factorList(x);
        HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
        if(fl.size()==0){
            return new HashMap<Integer,Integer>();
        }
        int prev = fl.get(0);
        int cnt = 0;
        for(int p : fl){
            if(prev == p){
                cnt++;
            }else{
                res.put(prev,cnt);
                prev = p;
                cnt = 1;
            }
        }
        res.put(prev,cnt);
        return res;
    }
}

