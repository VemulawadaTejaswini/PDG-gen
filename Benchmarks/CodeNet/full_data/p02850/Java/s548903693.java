import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N-1];
        int[] b = new int[N-1];
        for (int i=0; i<N-1; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        Ans ans = solve(N, a, b);

        System.out.println(ans.K);
        for (int i=0; i<N-1; i++) {
            System.out.println(ans.c[i]);
        }
    }

    private static Ans solve(int N, int[] a, int[] b) {
        Ans ans = new Ans(N);

        List<Integer[]>[] list = new ArrayList[N];
        for (int i=0; i<N; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i=0; i<N-1; i++) {
            list[a[i]-1].add(new Integer[]{i, b[i]-1});
            list[b[i]-1].add(new Integer[]{i, a[i]-1});
        }

        Queue<Integer> queue = new ArrayDeque();
        int[] color = new int[N];
        color[0] = 1;
        queue.add(0);
        while (queue.size() > 0) {
            int node = queue.poll();
            int coloring = 0;

            // System.err.println("node=" + (node+1));
            for (int i=0; i<list[node].size(); i++) {
                int edge = list[node].get(i)[0];
                int connect = list[node].get(i)[1];

                if (color[connect] != 0) {
                    // System.err.println("skip connection to " + (connect+1));
                    continue;
                }
                coloring++;
                if (node != 0 && color[node] == coloring) coloring++;

                // System.err.println("edge=" + edge + ", connect=" + (connect+1) + ", color[" + (node+1) + "]=" + color[node] + ", coloring=" + coloring);
                color[connect] = coloring;
                ans.c[edge] = coloring;

                queue.add(connect);
            }

            ans.K = Math.max(ans.K, coloring);
        }

        return ans;
    }

    public static class Ans {
        public int K;
        public int[] c;

        public Ans(int N) {
            K = 0;
            c = new int[N-1];
        }
    }
}