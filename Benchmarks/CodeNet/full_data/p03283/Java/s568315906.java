import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        List<Pair> LR = new ArrayList<>();
        for (int i=0; i<M; i++) {
            LR.add(new Pair(sc.nextInt(), sc.nextInt()));
        }

        List<Pair> pq = new ArrayList<>();
        for (int i=0; i<Q; i++) {
            pq.add(new Pair(sc.nextInt(), sc.nextInt()));
        }

        int[] ans = solve(N, M, Q, LR, pq);
        for (int i=0; i<Q; i++) {
            System.out.println(ans[i]);
        }

    }

    private static int[] solve(int N, int M, int Q, List<Pair> LR, List<Pair> pq) {
        int[] ans = new int[Q];

        Collections.sort(LR);

        for (int i=0; i<Q; i++) {
            Pair q = pq.get(i);
            for (int j=0; j<M; j++) {
                Pair p = LR.get(j);

                if (p.b > q.b) break;
                if (p.a >= q.a) ans[i]++;
            }
        }

        return ans;
    }

    static class Pair implements Comparable<Pair> {
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }


        @Override
        public int compareTo(Pair o) {
            return this.b - o.b;
        }
    }
}
