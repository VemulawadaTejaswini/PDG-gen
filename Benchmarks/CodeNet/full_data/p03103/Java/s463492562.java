import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = map.getOrDefault(a, 0);
            map.put(a, count + b);
        }

        long count = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int price = e.getKey();
            int num = e.getValue();
            if (m == 0) break;
            int min = Math.min(m, num);
            count += (long) min * price;
            m -= min;
        }
        System.out.println(count);
    }
}
