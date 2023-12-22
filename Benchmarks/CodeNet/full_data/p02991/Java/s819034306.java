import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] u = new int[M];
        int[] v = new int[M];
        for (int i=0; i<M; i++) {
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        int S = sc.nextInt();
        int T = sc.nextInt();

        System.out.println(solve(N, M, u, v, S, T));
    }

    /**
     * そのまま解く．
     * https://atcoder.jp/contests/abc132/submissions/6178008
     * @param N
     * @param M
     * @param u
     * @param v
     * @param S
     * @param T
     * @return
     */
    private static int solve(int N, int M, int[] u, int[] v, int S, int T) {
        List<List<Integer>> graph = new ArrayList();
        for (int i=0; i<N; i++) {
            graph.add(new ArrayList());
        }
        for (int i=0; i<M; i++) {
            graph.get(u[i]-1).add(v[i]-1);
        }
        // graph.forEach(System.err::println);


        List<Integer> next = new ArrayList();
        next.add(S-1);
        List<Integer> next2 = new ArrayList();

        boolean[] reached = new boolean[N];

        // i 回目のけんけんぱで移動できる範囲を列挙する
        for (int i=1; !next.isEmpty(); i++) {
            for (int k=0; k<3; k++) {
                for (int s: next) {
                    next2.addAll(graph.get(s));
                }

                next.clear();
                next.addAll(next2);
                next2.clear();
            }

            for (Integer n: next) {
                if (reached[n]) continue;
                if (n == T-1) return i;

                reached[n] = true;
                next2.add(n);
            }

            next.clear();
            next.addAll(next2);
            next2.clear();
        }

        return -1;
    }
}
