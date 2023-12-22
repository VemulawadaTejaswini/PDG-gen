

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        long N = sc.nextInt();
        long M = sc.nextInt();
        Map<Long, Long> tm = new TreeMap<>();
        for(int i = 0; i < N; i++) {
            long key = sc.nextInt();
            long val = sc.nextInt();
            tm.put(key,val);
        }
        long res = 0;
        long count = 0;
        for(Map.Entry<Long, Long> entry : tm.entrySet()) {
            long key = entry.getKey();
            long val = entry.getValue();

            res += key * val;
            count += val;

            if(count == M) break;

            if(count > M) {
                res = res - (key * (count - M));
                break;
            }

        }
        System.out.println(res);
    }
}
