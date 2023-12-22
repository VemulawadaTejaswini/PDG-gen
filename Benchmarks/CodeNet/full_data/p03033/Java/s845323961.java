import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Roadwork
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int Q = sc.nextInt();

            Work[] W = new Work[N];
            for (int i = 0; i < N; i++) {
                W[i] = new Work();
                W[i].S = sc.nextInt();
                W[i].T = sc.nextInt();
                W[i].X = sc.nextInt();
            }

            Arrays.sort(W, (o1, o2) -> {
                return Integer.compare(o1.X, o2.X);
            });

            List<Integer> D = new ArrayList<Integer>();
            Map<Integer, Integer> index = new HashMap<>();
            for (int i = 0; i < Q; i++) {
                int d = sc.nextInt();
                D.add(d);
                index.put(d, i);
            }

            int[] A = new int[Q];
            Arrays.fill(A, -1);

            for (int i = 0; i < N; i++) {
                Work w = W[i];

                int pos1 = Collections.binarySearch(D, w.S - w.X);
                if (pos1 < 0) {
                    pos1 = -(pos1 + 1);
                }

                int pos2 = Collections.binarySearch(D, w.T - w.X);
                if (pos2 < 0) {
                    pos2 = -(pos2 + 1);
                }

                //System.out.println(w.S + " " + w.T + " " + w.X + " " + pos1 + " " + pos2 + " " + D);

                if (pos1 == pos2) {
                    continue;
                }

                for (int p = pos1; p < pos2; p++) {
                    int q = D.remove(pos1);
                    A[index.get(q)] = w.X;
                }
            }

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < Q; i++) {
                ans.append(A[i]).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

    static class Work {

        int S;

        int T;

        int X;

    }

}
