import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(sc, out);
            out.flush();
        }
    }

    private void solve(Scanner sc, PrintWriter out) {
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            map.compute(d, (key, old) -> (old == null) ? 1 : old + 1);
        }

        

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            int tmp = map.compute(t, (key, old) -> (old == null) ? -1 : old - 1);
            if (tmp < 0) {
                out.println("NO");
                return;
            }
        }

        out.println("YES");
    }
}