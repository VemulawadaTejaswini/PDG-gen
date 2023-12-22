import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int W = stdIn.nextInt();
        int w[] = new int[N];
        int v[] = new int[N];
        for (int i = 0; i < N; i++) {
            w[i] = stdIn.nextInt();
            v[i] = stdIn.nextInt();
        }
        stdIn.close();
        Knapsack knapsak = new Knapsack();
        long max = knapsak.solve(w, v, W);
        System.out.println(max);
    }
}

class Knapsack {
    public long solve(int[] W, int[] P, int maxWeight) {
        long prev[] = new long[maxWeight + 1];
        long cur[] = new long[maxWeight + 1];

        for (int i = 0; i < W.length; i++) {
            for (int j = 0; j < cur.length; j++) {
                if (W[i] > j) {
                    cur[j] = Math.max(0, prev[j]);
                } else {
                    cur[j] = Math.max(prev[j], prev[j - W[i]] + P[i]);
                }
            }
            System
            for (int k = 0; k < cur.length; k++) {
                prev[k] = cur[k];
            }
        }

        return cur[cur.length - 1];
    }
}
