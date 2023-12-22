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

            boolean[] flag = new boolean[N];
            List<Integer>[] colors = new List[N];
            Map<Integer, Integer>[] colorMap = new Map[N];
            for (int i = 0; i < N; i++) {
                colors[i] = new ArrayList<>(K);
                colorMap[i] = new HashMap<>();
            }

            ArrayDeque<Integer> queue = new ArrayDeque<>();
            queue.add(0);
            while (queue.size() > 0) {
                int poll = queue.pollFirst();

                List<Integer> V = edges[poll];

                int k = 1;
                for (int v : V) {
                    if (flag[v]) {
                        continue;
                    }

                    while (colors[poll].contains(k)) {
                        k++;
                    }

                    colors[poll].add(k);
                    colors[v].add(k);
                    colorMap[poll].put(v, k);

                    queue.add(v);
                }

                flag[poll] = true;
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

    public static class Edge {

        public int index;

        public int A;

        public int B;

        public int C;

    }

}
