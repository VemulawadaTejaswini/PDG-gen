import java.util.*;

public class Main {
    static Map<Long, Long> mp = new HashMap<>();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        long sum = 0;
        for(long i=1;i<=K;i++){
            for(long j=1;j<=K;j++){
                for(long k=1;k<=K;k++){
                    sum += gcd(gcd(i,j),k);
                }
            }
        }
        System.out.println(sum);
    }


    private static long gcd(long a, long b){
        if(a < b){
            long tmp = a;
            a = b;
            b = tmp;
        }
        long key = a*1000+b;
        if(mp.containsKey(key)){
            return mp.get(key);
        }
        if(a % b == 0){
            return b;
        }
        long ans = gcd(b, a-b);;
        mp.put(key, ans);
        return ans;
    }
}
