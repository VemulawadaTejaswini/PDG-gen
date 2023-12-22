import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Optional;
import java.util.Comparator;
import java.util.Collections;

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
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        int[] V;
        int[] memo;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < M; i++) {
                int u = in.nextInt();
                map.put(u, map.getOrDefault(u, new ArrayList<>()));
                map.get(u).add(in.nextInt());
            }
            int S = in.nextInt();
            int T = in.nextInt();

            V = new int[N + 1];
            memo = new int[N + 1];
            Arrays.fill(memo, Integer.MAX_VALUE);
            int ans = calc(0, S, T, map, 0);
            out.println(ans);
        }

        private int calc(int kenkenpa, int S, int T, Map<Integer, List<Integer>> map, int count) {
            if (S == T && kenkenpa == 2) {
                return count;
            }
            if ((V[S] & 1 << (kenkenpa % 3)) > 0 && memo[S] <= count) {
                return -1;
            }
            V[S] |= 1 << (kenkenpa % 3);
            memo[S] = count;
            List<Integer> ans = new ArrayList<>();
            int temp = (kenkenpa + 1) % 3;
            for (int u : map.getOrDefault(S, Collections.emptyList())) {
                int n = calc(temp, u, T, map, count + 1);
                if (n >= 0) {
                    ans.add(n);
                }
            }
            int ret = ans.stream().min(Comparator.naturalOrder()).orElse(-1);
            return ret;
        }

    }
}

