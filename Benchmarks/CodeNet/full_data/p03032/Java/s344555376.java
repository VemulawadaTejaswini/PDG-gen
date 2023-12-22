import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, K;
        int[] v;
        N = in.nextInt();
        K = in.nextInt();
        v = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = in.nextInt();
        }
        long ans = solve(N, K, v);
        System.out.println(ans);
        in.close();
    }

    static long solve(int N, int K, int[] v) {
        long ans = Long.MIN_VALUE;
        int ops;
        ops = Math.min(N, K);
        for (int left = 0; left <= ops; left++) {
            for (int right = 0; left + right <= ops; right++) {
                ans = Math.max(ans, getJewel(left, right, v, K));
            }
        }
        return ans;
    }

    //左からleft, 右からright個とる
    static long getJewel(int left, int right, int[] v, int K) {
        long ret = 0;
        PriorityQueue<Integer> minValues = new PriorityQueue<>();
        for (int i = 0; i < left; i++) {
            minValues.add(v[i]);
        }
        for (int i = 0; i < right; i++) {
            minValues.add(v[v.length - 1 - i]);
        }
        int M = K - right - left;
        for (int i = 0; i < M; i++) {
            if (!minValues.isEmpty() && minValues.peek() < 0) {
                minValues.poll();
            }
        }
        while (!minValues.isEmpty()) {
            ret += minValues.poll();
        }
        return ret;
    }

}
