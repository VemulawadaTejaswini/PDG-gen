import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Long, Long> map = new TreeMap<>();
        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());
            sum += a;
            max = Math.max(max, b);
            map.merge(b, a, Long::sum);
        }
        if (max < sum) {
            System.out.println("No");
            return;
        }
        sum = 0;
        for (Map.Entry<Long, Long> e : map.entrySet()) {
            sum += e.getValue();
            if (sum > e.getKey()) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}