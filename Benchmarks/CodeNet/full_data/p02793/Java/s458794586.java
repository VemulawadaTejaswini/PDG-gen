import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        ArrayList<Long> primeList = getPrimeList(100000L);
        HashMap<Long,Integer> map = new HashMap<Long,Integer>();
        long max = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            long tmp = a[i];
            for(long p : primeList){
                if(tmp < p) break;
                int cnt = 0;
                while(tmp % p == 0){
                    cnt++;
                    tmp /= p;
                }
                if(map.containsKey(p)){
                    map.put(p, Math.max(map.get(p),cnt));
                }else{
                    map.put(p,cnt);
                }
                
            }
        }
        long ans = 0;
        for(long b : a){
            long tmp = 1;            
            for(Map.Entry<Long,Integer> e : map.entrySet()){
                long k = e.getKey();
                int v = e.getValue();
                long cnt = 0;
                while(b % k == 0){
                    cnt++;
                    b /= k;
                }
                tmp *= (long)Math.pow(k,v-cnt)%mod;
                tmp %= mod;
            }
            ans += tmp;
            ans %= mod;
        }
        System.out.println(ans);
    }
    
    private static ArrayList<Long> getPrimeList(long l){
        ArrayList<Long> ret = new ArrayList<Long>();
        if(l < 2) return ret;
        ret.add(2L);
        long len = (long)Math.pow(l,0.5)+1;
        for(long i = 3; i < len; i += 2){
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