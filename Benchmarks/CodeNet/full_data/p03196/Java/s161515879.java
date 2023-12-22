import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        if(n == 1){
            System.out.println(p);
            return;
        }
        HashMap<Long,Integer> pl = factorization(p);
        long ans = 1;
        for(Map.Entry<Long,Integer> e : pl.entrySet()){
            long k = e.getKey();
            long v = e.getValue();
            if(n <= v){
                ans *= Math.pow(k,v/n);
            }
        }
        System.out.println(ans);
    }
    
    static HashMap<Long,Integer> factorization(long x) {
        HashMap<Long,Integer> ret = new HashMap<Long,Integer>();
        int div2 = 0;
        while (x % 2 == 0) {
            x /= 2;
            div2++;
        }
        if(div2 != 0) ret.put(2L,div2);
        long d = 3;
        while (x/d >= d) {
            int cnt = 0;
            while (x % d == 0) {
                cnt++;
                x /= d;
            }
            if(cnt != 0) ret.put(d,cnt);
            d += 2;
        }
        if(ret.containsKey(x)){
            ret.put(x, ret.get(x)+1);
        }else{
            ret.put(x, 1);
        }
        return ret;
    }
}
