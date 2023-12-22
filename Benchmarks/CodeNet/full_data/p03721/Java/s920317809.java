import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            long b = Long.parseLong(sc.next());
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + b);
            } else {
                map.put(a, b);
            }
        }
        sc.close();

        // 主処理
        List<Integer> keys = new ArrayList<>();
        for (int key : map.keySet()) {
            keys.add(key);
        }
        Collections.sort(keys);

        long countSum = 0;
        int result = 0;
        for (int key : keys) {
            long count = map.get(key);
            countSum += count;
            if (k <= countSum) {
                result = key;
                break;
            }
        }

        // 出力
        System.out.println(result);
    }
}
