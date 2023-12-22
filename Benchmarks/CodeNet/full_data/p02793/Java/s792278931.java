import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long max = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            if(i == 0){
                max = a[i];
            }else{
                max = lcm(max,a[i]);
            }
        }
        long ans = 0;
        HashMap<Long,Integer> map = factorization(new HashMap<Long,Integer>(),max);
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
    
    static HashMap<Long,Integer> factorization(HashMap<Long,Integer> ret, long x) {
        int div2 = 0;
        while (x % 2 == 0) {
            x /= 2;
            div2++;
        }
        if(div2 != 0){
            if(ret.containsKey(2L)){
                ret.put(2L, Math.max(ret.get(2L),div2));
            }else{
                ret.put(2L, div2);
            }
            
        }
        long d = 3;
        while (x/d >= d) {
            int cnt = 0;
            while (x % d == 0) {
                cnt++;
                x /= d;
            }
            if(cnt != 0){
                if(ret.containsKey(d)){
                    ret.put(d, Math.max(ret.get(d),cnt));
                }else{
                    ret.put(d, cnt);
                }   
            }
            d += 2;
        }
        if(x != 1 && !ret.containsKey(x)){
            ret.put(x, 1);
        }
        return ret;
    }
    
    private static long gcd(long a, long b){
        while (b > 0)
        {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static long lcm(long a, long b){
        return a * (b / gcd(a, b));
    }
}