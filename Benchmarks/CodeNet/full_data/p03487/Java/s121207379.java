import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> count = new HashMap<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a=in.nextInt();
            if (count.containsKey(a)) {
                count.replace(a, count.get(a) + 1);
            } else {
                count.put(a, 1);
            }
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> kv : count.entrySet()) {
            if (kv.getKey() <= kv.getValue()) {
                res += kv.getValue() - kv.getKey();
            } else {
                res += kv.getValue();
            }
        }
        System.out.println(res);
    }
}