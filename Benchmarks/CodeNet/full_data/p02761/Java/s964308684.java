import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] s = new int[m];
            int[] c = new int[m];
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(0);
            }

            String result = "-1";
            for (int i = 0; i < m; i++) {
                s[i] = sc.nextInt();
                c[i] = sc.nextInt();

                Integer a = map.get(s[i]);
                if (a == null) {
                    map.put(s[i], c[i]);
                } else if (a != c[i]) {
                    System.out.println(result);
                    return;
                }

            }

            int cnt = 0;
            for (int a : s) {
                int index = a - 1;
                int b = list.get(index);

                if (b == 0) {
                    list.set(index, c[cnt]);
                }
                cnt++;
            }

            if (list.size() > 1 && list.get(0) == 0) {
                System.out.println(result);
                return;
            }

            StringBuilder sb = new StringBuilder();
            list.forEach(a -> {
                sb.append(a);
            });
            System.out.println(sb.toString());

        }
    }

}