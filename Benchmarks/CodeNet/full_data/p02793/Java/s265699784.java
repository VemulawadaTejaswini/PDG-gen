import java.util.*;


public class Main {
    public static final long MOD = 1000000007;

    public static Long pow(Long a, Long n){
        if(n == 0){return new Long(1);}
        if(n == 1){return a;}
        Long res = n/2;
        Long rem = n%2;
        Long p = pow(a, res) % MOD;
        return (p*p*pow(a, rem)) % MOD;
    }

    public static Long modinv(Long a){
        return pow(a, MOD-2);
    }



    public static Long LCM(Long a, Long b){
        if(a < b){return LCM(b, a);}
        if(a % b == 0){
            return b;
        }else{
            return LCM(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        List<SoInsu> llist = new ArrayList<>(N);
        for(int i=0;i<N;i++){
            llist.add(new SoInsu(sc.nextLong()));
        }
        SoInsu result = llist.stream().reduce(
                new SoInsu(1L),
                (a, b)->
                    SoInsu.LCM(a,b)
                );
        long ans = 0;
        for(SoInsu p:llist){
            ans += result.waru(p);
        }
        System.out.println(ans % 1000000007);
    }

    public static class SoInsu{
        Map<Long, Long> mp = new HashMap<>();
        public SoInsu(Long a){
            long maxSQ = (long)Math.sqrt(a)+1;
            for(long i=2;i<=maxSQ;i++){
                if(a % i == 0){
                    a /= i;
                    long cnt=mp.computeIfAbsent(new Long(i), (val)-> 0L);
                    mp.put(new Long(i), cnt+1);
                    i--;
                }
            }
            if(a != 1){
                mp.put(a, 1L);
            }
        }
        public SoInsu(){}

        public static SoInsu LCM(SoInsu a, SoInsu b){
            SoInsu ret = new SoInsu();
            for(Long k: a.mp.keySet()){
                if(b.mp.containsKey(k)){
                    ret.mp.put(k, Math.max(a.mp.get(k), b.mp.get(k)));
                }else{
                    ret.mp.put(k, a.mp.get(k));
                }
            }
            for(Long k: b.mp.keySet()){
                if(ret.mp.containsKey(k)){
                    ret.mp.put(k, Math.max(a.mp.get(k), b.mp.get(k)));
                }else{
                    ret.mp.put(k, b.mp.get(k));
                }
            }
            return ret;
        }

        public long waru(SoInsu p){
            SoInsu ret = new SoInsu();
            for(Long k:mp.keySet()){
                ret.mp.put(k, mp.get(k));
            }

            for(Long k:p.mp.keySet()){
                ret.mp.put(k, ret.mp.get(k)-p.mp.get(k));
            }
            long res = 1;
            for(Long k:ret.mp.keySet()){
                res *= pow(k, ret.mp.get(k));
                res %= MOD;
            }
            return res;
        }

        @Override
        public String toString(){
            return mp.toString();
        }
    }
}
