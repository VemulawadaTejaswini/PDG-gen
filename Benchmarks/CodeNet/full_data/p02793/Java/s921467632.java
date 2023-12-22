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
        HashSet<Long> a = new HashSet<>(n);
        for(int i=0;i<n;i++) a.add(sc.nextLong());
        long multi = LCM(a);
        long ans = 0;
        for(long w:a){
            ans = ans+multi*power(w,mod-2)%mod;
            ans %=mod;
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
    long LCM(HashSet<Long> a){
        HashMap<Integer,Integer> rec = new HashMap<>(a.size());
        int maxi = -1;
        for(long w:a) maxi = Math.max(maxi,(int)w);
        ArrayList<Integer>[] pc = new ArrayList[maxi+1];
        for(int i=0;i<=maxi;i++) pc[i]=new ArrayList<Integer>();
        for(int i=2;i<=maxi;i++){
            if(pc[i].size()>0) continue;
            for(int j=2*i;j<=maxi;j+=i){
                pc[j].add(i);
            }
        }
        for(long w:a){
            // prime decomposition of w
            int now = (int)w;
            if(pc[now].size()==0) {
                rec.put(now,Math.max(1,rec.getOrDefault(now,0))); // w is a prime number
            }
            else{
                for(Integer p:pc[now]){
                    int back = now,cnt=0;
                    while(back%p==0){
                        cnt++;
                        back /= p;
                    }
                    if(rec.getOrDefault(p,0)<cnt) rec.put(p,cnt);
                }
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

