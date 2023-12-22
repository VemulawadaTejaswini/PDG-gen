import java.util.*;

public class Main {
  	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();

        int[] w = new int[n];
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        long knapSack = knapSack(W, w, v, n - 1);
        System.out.println(knapSack);
    }

    private static long knapSack(int W, int[] w, int[] v, int i) {
        if (i < 0 || W <= 0) {
            return 0;
        }

        if (w[i] > W) {
            return knapSack(W, w, v, i - 1);
        }

        long v1 = knapSack(W - w[i], w, v, i - 1) + v[i];
        long v2 = knapSack(W, w, v, i - 1);
        return Math.max(v1, v2);
    }

}
