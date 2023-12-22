import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.HashMap;
import java.util.OptionalInt;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Map.Entry;

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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                map.put(i, new ArrayList<>());
            }

            for (int i = 0; i < N; i++) {
                String S = in.next();
                for (int j = 0; j < N; j++) {
                    if (S.charAt(j) == '1') {
                        map.get(i).add(j);
                        map.get(j).add(i);
                    }
                }
            }

            int min = map.values().stream().mapToInt(List::size).min().getAsInt();
            int start = map.entrySet().stream().filter(e -> e.getValue().size() == min).mapToInt(Map.Entry::getKey).min().getAsInt();

            int[] gs = new int[N + 1];
            Arrays.fill(gs, -1);
            gs[start] = 1;
            List<List<Integer>> next = new ArrayList<>();
            for (int right : map.get(start)) {
                next.add(Arrays.asList(start, right));
            }
            while (!next.isEmpty()) {
                List<Integer> pair = next.remove(0);
                int li = pair.get(0);
                int ri = pair.get(1);
                if (gs[ri] == -1) {
                    gs[ri] = gs[li] + 1;
                    for (int n : map.get(ri)) {
                        next.add(Arrays.asList(ri, n));
                    }
                } else if (Math.abs(gs[li] - gs[ri]) != 1) {
                    out.println(-1);
                    return;
                }
            }
            int max = Arrays.stream(gs).max().getAsInt();
            out.println(max);
        }

    }
}

