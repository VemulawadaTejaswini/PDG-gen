import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] sum = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(i == 0) sum[i] = a % m;
            else sum[i] = (sum[i-1] + a) % m;
            if(!map.containsKey(sum[i])) map.put(sum[i], 1);
            else map.put(sum[i], map.get(sum[i]) +1);
        }
        long ans = 0L;
        for(Entry<Integer, Integer> e : map.entrySet()){
            ans += e.getValue() * (e.getValue()-1) / 2;
        }
        System.out.println(ans);
        sc.close();

    }

}
