import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Long,Long> map = new HashMap<Long,Long>();
        ArrayList<Long> li = new ArrayList<Long>();
        for(int i = 0; i < n; i++){
            long l = sc.nextLong();
            li.add(l);
            map = fact(l,map);
        }
        long ans = 0;
        for(long v : li){
            long tmp = 1;
            HashMap<Long,Long> hs = new HashMap<Long,Long>();
            hs = fact(v,hs);
            for (Map.Entry<Long,Long> mv : map.entrySet()) {
                 if(hs.containsKey(mv.getKey())){
                     tmp *= (long)Math.pow(mv.getKey(),(mv.getValue() - hs.get(mv.getKey())));
                     tmp %= mod;
                     //System.out.println(mv.getKey()+" " + mv.getValue()+" "+Math.pow(mv.getKey(),(mv.getValue() - hs.get(mv.getKey())))+" "+ v);
                 }else{
                     tmp *= (long)Math.pow(mv.getKey(),mv.getValue());
                     //System.out.println(mv.getKey()+" " + mv.getValue()+" "+Math.pow(mv.getKey(),mv.getValue())+" "+ v);
                     tmp %= mod;
                 }
            }
            //System.out.println(hs);
            ans += tmp;
            ans %= mod;
        }
        //System.out.println(map);
        System.out.println(ans%mod);
    }
    
    static HashMap<Long,Long> fact(long l, HashMap<Long,Long> map) {
        long cnt = 0;
        while (l % 2 == 0) {
            cnt++;
            l /= 2;
        }
        if(cnt != 0 &&(!map.containsKey(2L) || map.get(2L) < cnt)){
            map.put(2L,cnt);
        }
        long d = 3;
        long q = l / d;
        while (q >= d) {
            cnt = 0;
            while(l % d == 0) {
                cnt++;
                l /= d;
            }
            if(cnt != 0 && (!map.containsKey(d) || map.get(d) < cnt)){
                map.put(d,cnt);
            }
            d += 2;
            q = l / d;
        }
        if(l != 1 && (!map.containsKey(l) || map.get(l) < cnt)){
            map.put(l,1L);
        }
        return map;
    }
}