import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Optional;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        www solver = new www();
        solver.solve(1, in, out);
        out.close();
    }

    static class www {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            HashMap<Integer, Integer> n1 = new HashMap<>();
            HashMap<Integer, Integer> n2 = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int v = in.nextInt();
                if (i % 2 == 0) {
                    n2.put(v, n2.getOrDefault(v, 0) + 1);
                } else {
                    n1.put(v, n1.getOrDefault(v, 0) + 1);
                }
            }
            Map.Entry<Integer, Integer> n1max = n1.entrySet().stream().max((e1, e2) -> Integer.compare(e1.getValue(), e2.getValue())).get();
            Map.Entry<Integer, Integer> n2max = n2.entrySet().stream().max((e1, e2) -> Integer.compare(e1.getValue(), e2.getValue())).get();

            int nn1;
            int nn2;
            if (n1max.getKey().equals(n2max.getKey())) {
                if ((n1.size() > n2.size() && n1max.getValue().equals(n2max.getValue())) ||
                        (n1max.getValue() < n2max.getValue())) {
                    // n2採用
                    nn2 = n2max.getKey();
                    int finalNn = nn2;
                    nn1 = n1.entrySet().stream()
                            .filter(e -> e.getKey() != finalNn)
                            .max((e1, e2) -> Integer.compare(e1.getValue(), e2.getValue()))
                            .get().getKey();

                } else if ((n1.size() < n2.size() && n1max.getValue().equals(n2max.getValue())) ||
                        (n1max.getValue() > n2max.getValue())) {
                    // n1採用
                    nn1 = n1max.getKey();
                    int finalNn1 = nn1;
                    nn2 = n2.entrySet().stream()
                            .filter(e -> e.getKey() != finalNn1)
                            .max((e1, e2) -> Integer.compare(e1.getValue(), e2.getValue()))
                            .get().getKey();

                } else {
                    nn1 = n1max.getKey();
                    nn2 = -1;
                }
            } else {
                nn1 = n1max.getKey();
                nn2 = n2max.getKey();
            }

            long result = 0;
            for (Map.Entry<Integer, Integer> e : n1.entrySet()) {
                if (e.getKey() != nn1) {
                    result += e.getValue();
                }
            }
            for (Map.Entry<Integer, Integer> e : n2.entrySet()) {
                if (e.getKey() != nn2) {
                    result += e.getValue();
                }
            }
            out.print(result);
        }

    }
}

