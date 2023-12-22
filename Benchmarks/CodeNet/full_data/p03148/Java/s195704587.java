import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.AbstractCollection;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Comparator;
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

            List<Integer> l = new ArrayList<>();
            Map<Integer, LinkedList<Integer>> map = new HashMap<>();
            long kinds = 0;
            long sum = 0;
            for (int i = 0; i < K; i++) {
                sum += sushi[i][1];
                int kind = sushi[i][0];
                map.putIfAbsent(kind, new LinkedList<>());
                map.get(kind).add(i);
                if (map.get(kind).size() == 1) {
                    kinds++;
                }
                if (map.get(kind).size() == 2) {
                    l.add(kind);
                }
            }
            LinkedList<int[]> que = new LinkedList<>();
            for (int kind : l) {
                for (int i : map.get(kind)) {
                    que.add(new int[]{sushi[i][1], i});
                }
            }
            que.sort(Comparator.comparingInt(a -> a[0]));

            long max = sum + kinds * kinds;
            for (int i = K; i < N; i++) {
                int kind = sushi[i][0];
                if (!map.containsKey(kind)) {
                    if (que.isEmpty()) {
                        break;
                    }
                    int[] q = que.removeFirst();
                    while (!l.contains(sushi[q[1]][0])) {
                        q = null;
                        if (que.isEmpty()) {
                            break;
                        }
                        q = que.removeFirst();
                    }
                    if (q == null) {
                        break;
                    }
                    int index = q[1];
                    LinkedList<Integer> list = map.get(sushi[index][0]);
                    if (list == null) {
                        out.println(index);
                    }
                    list.removeLast();
                    if (list.size() == 1) {
                        l.remove(Integer.valueOf(sushi[index][0]));
                    }
                    sum += (sushi[i][1] - sushi[index][1]);
                    kinds++;
                    max = Math.max(max, sum + kinds * kinds);
                    map.put(sushi[i][0], null);
                }
            }

            out.println(max);
        }

    }
}

