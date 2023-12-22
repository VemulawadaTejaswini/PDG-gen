import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            map.merge(a, 1, Integer::sum);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int k = e.getKey();
            int v = e.getValue();
            if (k > v) {
                ans += v;
            } else if (k < v) {
                ans += (v - k);
            }
        }
        System.out.println(ans);
    }
}