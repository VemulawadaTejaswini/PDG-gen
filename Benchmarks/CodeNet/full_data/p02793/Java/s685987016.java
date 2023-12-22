import java.io.*;
import java.util.*;

public class Main{
    PrintWriter out = new PrintWriter(System.out);
    long mod = 1000000000+7;
    static public void main(String[] args) throws Exception{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ")
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] a = new long[n];
        for(int i=0;i<n;i++) a[i]=sc.nextLong();
        long multi = LCM(a);
        long ans = 0;
        for(int i=0;i<n;i++){
            ans = (ans + multi*power(a[i],mod-2)%mod)%mod;
        }
        return ans;
    }

    long power(long base, long p){
        long ans = 1;
        while(p>0){
            if(p%2==1) ans = ans*base%mod;
            base = base*base%mod;
            p /= 2;
        }
        return ans;
    }
    ArrayList<Integer> Primes(int upper){
        boolean[] rec = new boolean[upper+1];
        ArrayList<Integer> ans = new ArrayList<>(Math.max(upper/10,10));
        for(int i=2;i<=upper;i++){
            if(rec[i]) continue;
            ans.add(i);
            for(int j=i;j<=upper;j+=i){
                rec[j] = true;
            }
        }
        return ans;
    }
    long LCM(long[] a){
        HashMap<Integer,Integer> rec = new HashMap<>(a.length);
        int maxi = -1;
        for(long w:a) maxi = Math.max(maxi,(int)w);
        ArrayList<Integer> primes = Primes(maxi);
        for(long w:a){
            // prime decomposition of w
            long now = w;
            for(int i=0;i<primes.size();i++){
                int p = primes.get(i);
                if(p>w) break;
                if(now%p!=0) continue;
                int cnt = 0;
                while(now%p==0){
                    now = now/p;
                    cnt += 1;
                }
                if(rec.getOrDefault(p,0)<cnt) rec.put(p,cnt);
            }
        }
        long ans = 1;
        for(int key:rec.keySet()){
            ans *= power(key,rec.get(key));
            ans %= mod;
        }
        return ans;
    }
}

