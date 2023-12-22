import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        long sum = 0;
        long[] memo = new long[n];
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(sc.next());
            memo[i] = sum;
        }

        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(memo[i])) {
                map.put(memo[i], map.get(memo[i]) + 1);
            } else {
                map.put(memo[i], 1L);
            }
        }

        long count = 0;
        for (Long key : map.keySet()) {
            long num = map.get(key);
            if (key == 0) {
                count += num;
            }
            count += num * (num - 1) / 2;
        }

        System.out.println(count);
    }
}