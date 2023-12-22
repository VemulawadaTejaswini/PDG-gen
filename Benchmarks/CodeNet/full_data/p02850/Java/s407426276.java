import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N - 1];
            int[] B = new int[N - 1];
            for (int i = 0; i < N - 1; i++) {
                A[i] = sc.nextInt() - 1;
                B[i] = sc.nextInt() - 1;
            }

            List<Integer>[] edges = new List[N];
            for (int i = 0; i < N; i++) {
                edges[i] = new ArrayList<>();
            }
            for (int i = 0; i < N - 1; i++) {
                edges[A[i]].add(B[i]);
                edges[B[i]].add(A[i]);
            }

            int K = Arrays.stream(edges).mapToInt(e -> e.size()).max().getAsInt();

            Map<Integer, Integer>[] colorMap = new Map[N];
            for (int i = 0; i < N; i++) {
                colorMap[i] = new HashMap<>();
            }

            dfs(0, -1, -1, colorMap, edges);

            StringBuilder ans = new StringBuilder();
            ans.append(K).append("\n");
            for (int i = 0; i < N - 1; i++) {
                Integer c = null;
                if (colorMap[A[i]] != null) {
                    c = colorMap[A[i]].get(B[i]);
                }

                if (c == null) {
                    c = colorMap[B[i]].get(A[i]);
                }

                ans.append(c).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

    public static void dfs(int v, int pv, int pc, Map<Integer, Integer>[] colorMap, List<Integer>[] edges) {
        int c = 1;
        for (int nv : edges[v]) {
            if (nv == pv) {
                continue;
            }

            if (c == pc) {
                c++;
            }

            colorMap[v].put(nv, c);

            dfs(nv, v, c, colorMap, edges);

            c++;
        }
    }

}
