import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long p = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        Map<Integer, Integer> primeFactorizationMap = primeFactorizationMap(p);
        Map<Long, Long> map = new HashMap<>();
        for (int key : primeFactorizationMap.keySet()) {
            int count = primeFactorizationMap.get(key);
            if (map.containsKey((long) count)) {
                for (long i = count; 0 <= i; i--) {
                    map.put(i, (long) map.get(i) * (long) key);
                }
            } else {
                for (long i = count; 0 <= i; i--) {
                    map.put(i, (long) key);
                }
            }
        }
        Long index = Math.min(map.size() - 1, n);
        long result = map.get(index);

        // 出力
        System.out.println(result);
    }

    public static Map<Integer, Integer> primeFactorizationMap(long num) {
        Map<Integer, Integer> map = new HashMap<>();
        if (num == 1) {
            map.put(1, 1);
            return map;
        }
        int max = (int) Math.sqrt(num);
        int div = 2;
        while (div <= max) {
            if (num % div == 0) {
                num /= div;
                if (map.containsKey(div)) {
                    map.put(div, map.get(div) + 1);
                } else {
                    map.put(div, 1);
                }
            } else {
                div++;
            }
        }
        if (num != 1) {
            map.put((int) num, 1);
        }
        return map;
    }
}
