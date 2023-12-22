import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            m.put(i, 0);
        }
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int t = a / 400;
            if (t > 9) {
                t = 8;
            }
            m.put(t, m.get(t) + 1);
        }
        int count = 0;
        for (int i = 0; i < 8; i++) {
            if (m.get(i) != 0) {
                count++;
            }
        }
        int max = count + m.get(8);
        if (max > 9) {
            max = 8;
        }
        System.out.printf("%s %s", count, max);
    }
}
