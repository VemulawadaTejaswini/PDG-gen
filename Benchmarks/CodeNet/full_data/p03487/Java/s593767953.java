import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            if(map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1l);
            }
        }
        long ans = 0;
        Set<Map.Entry<Long,Long>> entries = map.entrySet();
        for(Map.Entry<Long, Long> entry : entries) {
            if(entry.getKey() < entry.getValue()) {
                ans += entry.getValue() - entry.getKey();
            } else if(entry.getKey() > entry.getValue()){
                long min = Math.min(entry.getKey() - entry.getValue(), entry.getValue());
                ans += min;
            }
        }
        System.out.println(ans);
    }
}