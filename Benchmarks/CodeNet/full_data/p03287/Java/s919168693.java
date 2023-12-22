import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        long[] sum = new long[n];
        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            if(i == 0) sum[i] = a % m;
            else sum[i] = (sum[i-1] + a) % m;
            if(!map.containsKey(sum[i])) map.put(sum[i], 1L);
            else map.put(sum[i], map.get(sum[i]) +1);
        }
        long ans = 0L;
        for(Entry<Long, Long> e : map.entrySet()){
            ans += e.getValue() * (e.getValue()-1) / 2;
        }
        System.out.println(ans);
        sc.close();

    }

}
