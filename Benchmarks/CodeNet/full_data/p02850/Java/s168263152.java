import java.util.ArrayDeque;
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
            List<Integer>[] edges = new List[N];
            for (int i = 0; i < N; i++) {
                edges[i] = new ArrayList<>();
            }

            for (int i = 0; i < N - 1; i++) {
                A[i] = sc.nextInt() - 1;
                B[i] = sc.nextInt() - 1;

                edges[A[i]].add(B[i]);
                edges[B[i]].add(A[i]);
            }

            int K = Arrays.stream(edges).mapToInt(edge -> edge.size()).max().getAsInt();

            List<Integer>[] colors = new List[N];
            Map<Integer, Integer>[] colorMap = new Map[N];
            for (int i = 0; i < N; i++) {
                colors[i] = new ArrayList<>(K);
                colorMap[i] = new HashMap<>();
            }

            ArrayDeque<Integer> queue = new ArrayDeque<>();
            for (int i = 0; i < N; i++) {
                if (edges[i].size() == K) {
                    queue.add(i);
                    break;
                }
            }

            List<Integer> list = new ArrayList<>(K);
            for (int k = 1; k <= K; k++) {
                list.add(k);
            }

            while (queue.size() > 0) {
                int poll = queue.pollFirst();

                List<Integer> V = edges[poll];

                List<Integer> list2 = new ArrayList<>(list);
                list2.removeAll(colors[poll]);

                int x = 0;
                for (int v : V) {
                    int k = list2.get(x);
                    x++;

                    colors[v].add(k);
                    colorMap[poll].put(v, k);
                    edges[v].remove(Integer.valueOf(poll));

                    if (edges[v].size() > 0) {
                        queue.add(v);
                    }
                }
            }

            StringBuilder ans = new StringBuilder();
            ans.append(K).append("\n");
            for (int i = 0; i < N - 1; i++) {
                Integer c = colorMap[A[i]].get(B[i]);
                if (c == null) {
                    c = colorMap[B[i]].get(A[i]);
                }

                ans.append(c).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

}
