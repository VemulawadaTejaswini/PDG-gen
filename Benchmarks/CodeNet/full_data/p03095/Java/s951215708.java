import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();

        HashMap<Character, Integer> map = new HashMap<>();
        String str = sc.next();
        char[] values = str.toCharArray();
        for (int i = 0; i < N; i++) {
            map.put(values[i], map.containsKey(values[i]) ? map.get(values[i]) + 1: 1);
        }

        List<Integer> counts = new ArrayList<>();
        for (Integer count: map.values()) {
            counts.add(count);
        }

        long sum = 0;
        for (int mask = 1; mask < (1 << map.size()); mask++) {
            long tmp = 1;
            for (int i = 0; i < counts.size(); i++) {
                if (((mask >> i) & 1) == 1 && counts.get(i) != 1) {
                    long max = Math.max(tmp, counts.get(i));
                    long min = Math.min(tmp, counts.get(i));
                    tmp = (max % 1000000007l) * min;
                }
            }
            sum += (tmp % 1000000007l);
        }

        System.out.println(sum);
    }
}