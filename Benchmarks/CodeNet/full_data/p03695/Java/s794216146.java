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
        int min = 0;
        int add = 0;
        if (m.get(8) == 0) {

        } else {
            if (m.get(8) % 8 == 0) {
                add = m.get(8) / 8;
            } else {
                add = m.get(8) / 8 + 1;
            }
        }
        for (int i = 0; i < m.get(8); i++) {

        }
        for (int i = 0; i < 8; i++) {
            if (m.get(i) != 0) {
                min++;
            }
        }
        for (int i = 0; i < m.get(8); i++) {
            int miIdx = 0;
            int mi = Integer.MAX_VALUE;
            for (int j = 0; j < 8; j++) {
                if (m.get(j) < mi) {
                    mi = m.get(j);
                    miIdx = j;
                }
            }
            m.put(miIdx, m.get(miIdx) + 1);
        }
        int max = 0;
        for (int i = 0; i < 8; i++) {
            if (m.get(i) != 0) {
                max++;
            }
        }
        if (min == 0) {
            min = add;
        }
        System.out.printf("%s %s", min, max);
    }
}
