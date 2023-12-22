import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[][] sushi = new int[N][2];
            for (int i = 0; i < N; i++) {
                sushi[i] = new int[]{in.nextInt(), in.nextInt()};
            }
            Arrays.sort(sushi, (a, b) -> Integer.compare(b[1], a[1]));

            Map<Integer, List<Integer>> map = new HashMap<>();
            long kinds = 0;
            long sum = 0;
            for (int i = 0; i < K; i++) {
                sum += sushi[i][1];
                int kind = sushi[i][0];
                map.putIfAbsent(kind, new ArrayList<>());
                map.get(kind).add(i);
                if (map.get(kind).size() == 1) {
                    kinds++;
                }
            }

            long max = sum + kinds * kinds;
            for (int i = K; i < N; i++) {
                int kind = sushi[i][0];
                if (!map.containsKey(kind)) {
                    int index = -1;
                    for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                        if (entry.getValue().size() <= 1) {
                            continue;
                        }
                        List<Integer> list = entry.getValue();
                        index = list.remove(list.size() - 1);
                    }
                    if (index == -1) {
                        break;
                    }
                    sum += (sushi[i][1] - sushi[index][1]);
                    kinds++;
                    max = Math.max(max, sum + kinds * kinds);
                    map.put(sushi[i][0], Arrays.asList(sushi[i][0]));
                }
            }

            out.println(max);
        }

    }
}

