import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(sc.next());
            map.merge(a, 1, Integer::sum);
        }
        int ans = 0;
        for (Map.Entry<Long, Integer> e : map.entrySet()) {
            if (e.getKey() > e.getValue()) {
                ans += e.getValue();
            } else if (e.getKey() < e.getValue()) {
                ans += (e.getValue() - e.getKey());
            }
        }
        System.out.println(ans);
    }
}