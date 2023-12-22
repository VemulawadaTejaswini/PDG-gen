import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        Integer a = Integer.MAX_VALUE;
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long d = sc.nextLong();
            int count = map.getOrDefault(d, 0);
            map.put(d, ++count);
        }
        for (int i = 0; i < m; i++) {
            long d = sc.nextLong();
            int count = map.getOrDefault(d, 0);
            if (count == 0) {
                System.out.println("NO");
                return;
            }
            map.put(d, --count);
        }
        System.out.println("YES");
    }
}
