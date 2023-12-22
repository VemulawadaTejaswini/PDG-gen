import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Count Order
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            String P = "";
            String Q = "";
            for (int i = 0; i < N; i++) {
                P += sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                Q += sc.nextInt();
            }

            List<String> list = new ArrayList<>();
            boolean[] use = new boolean[N];
            dfs("", use, list);
            Collections.sort(list);

            int a = list.indexOf(P);
            int b = list.indexOf(Q);

            System.out.println(Math.abs(a - b));
        }
    }

    static void dfs(String str, boolean[] use, List<String> list) {
        if (str.length() == use.length) {
            list.add(str);
            return;
        }

        for (int i = 0; i < use.length; i++) {
            if (use[i]) {
                continue;
            }

            use[i] = true;
            dfs(str + (i + 1), use, list);
            use[i] = false;
        }
    }

}
