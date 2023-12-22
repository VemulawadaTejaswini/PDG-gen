import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            a[i] = val;
            int count = map.getOrDefault(val, 0);
            map.put(val, ++count);
        }

        Map<Integer, Long> countMap = new HashMap<>();
        long allSum = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            long val = e.getValue();
            long p = val * (val -1) / 2;
            allSum += p;
            countMap.put(e.getKey(), p);
        }

        for (int i = 0; i < n; i++) {
            int cur = a[i];
            long sum = allSum;
            int val = map.get(cur);
            if (val > 1) {
                long minus = countMap.get(cur);
                long plus = (val - 1) * (val - 2)/2;
                sum = sum + plus - minus;
            }

            System.out.println(sum);
        }
    }
}
