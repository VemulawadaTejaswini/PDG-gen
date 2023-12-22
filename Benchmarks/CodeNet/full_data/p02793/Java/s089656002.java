import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


public class Main {
    public static final long MOD = 1000000007;

    private static long pow(long b, long e) {
        long ans = 1;
        long x = b % MOD;
        for (long y = e; y != 0; y >>= 1) {
            if ((y & 1) == 1) ans = (ans * x) % MOD;
            x = (x * x) % MOD;
        }
        return ans;
    }

    public static List<Integer> sosuu = new ArrayList<>();

    public static long modInv(int a){
        return pow(a, MOD-2);
    }

    public static void main(String[] args) {
        sosuu = IntStream.rangeClosed(2, 1000000)
                .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
                        .allMatch(j -> i%j !=0)).boxed().collect(Collectors.toList());
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int[] A = new int[N];
        List<SoInsu> llist = new ArrayList<>(N);
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            llist.add(new SoInsu(A[i]));
        }
        SoInsu result = new SoInsu();
        for(SoInsu l:llist){
            for(Long k:l.mp.keySet()) {
                if (!result.mp.containsKey(k) || (result.mp.get(k) < l.mp.get(k))){
                    result.mp.put(k, l.mp.get(k));
                }
            }
        }
        long res = result.mod();
        long ans = 0;
        for(int a :A){
            ans += (res * modInv(a));
            ans %= MOD;
        }
        System.out.println(ans % 1000000007);
    }

    public static class SoInsu{
        Map<Long, Long> mp = new HashMap<>();
        public SoInsu(int a){
            for(Integer s:sosuu){
                if(a % s == 0){
                    long cnt=0;
                    while(a % s == 0){
                        a /= s;
                        cnt++;
                    }
                    mp.put(new Long(s), cnt);
                }
                if(Math.sqrt(a) < s){break;}
            }
            if(a > 1){
                mp.put(new Long(a), 1L);
            }
        }
        public SoInsu(){}

        public SoInsu waruS(SoInsu p){
            SoInsu ret = new SoInsu();
            for(Map.Entry<Long, Long> e:mp.entrySet()){
                ret.mp.put(e.getKey(), e.getValue());
            }
            for(Map.Entry<Long, Long> e:p.mp.entrySet()){
                ret.mp.put(e.getKey(), ret.mp.get(e.getKey())-e.getValue());
            }
            return ret;
        }
        public SoInsu kakeru(SoInsu p){
            SoInsu ret = new SoInsu();
            for(Map.Entry<Long, Long> e:mp.entrySet()){
                ret.mp.put(e.getKey(), e.getValue());
            }
            for(Map.Entry<Long, Long> e:p.mp.entrySet()){
                ret.mp.put(e.getKey(), ret.mp.getOrDefault(e.getKey(), 0L)+e.getValue());
            }
            return ret;
        }

        public long mod(){
            long res = 1;
            for(Long k:mp.keySet()){
                res *= pow(k, mp.get(k));
                res %= MOD;
            }
            return res;
        }

        public long waru(SoInsu p){
            long res = 1;
            for(Long k:mp.keySet()){
                long s =mp.get(k);
                if(p.mp.containsKey(k)){
                    s -= p.mp.get(k);
                }
                res *= pow(k, s);
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
