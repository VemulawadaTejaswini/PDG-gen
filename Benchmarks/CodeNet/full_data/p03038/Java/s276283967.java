import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
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
            int M = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            int[] B = new int[M];
            int[] C = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = in.nextInt();
                C[i] = in.nextInt();
            }
            Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
            for (int i = 0; i < M; i++) {
                int value = B[i];
                if (map.containsKey(C[i])) {
                    value += map.get(C[i]);
                }
                map.put(C[i], value);
            }

            List<Integer> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry :
                    map.entrySet()) {
                for (int i = 0; i < entry.getValue(); i++) {
                    list.add(entry.getKey());
                }
                if (N < list.size()) {
                    break;
                }
            }
            list.sort(Comparator.reverseOrder());

            Arrays.sort(A);

            int index = 0;
            for (int n : list) {
                if (A[index] >= n || N <= index) {
                    break;
                }
                A[index++] = n;
            }

            out.println(Arrays.stream(A).asLongStream().sum());
        }

    }
}

