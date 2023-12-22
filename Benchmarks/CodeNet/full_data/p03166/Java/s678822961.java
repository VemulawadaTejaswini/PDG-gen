import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] edges = new int[M][2];
        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, Integer> memo = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            map.get(start).add(end);
        }

        int res = 0;
        for (int i = 1; i <= N; i++) {
            res = Math.max(res, helper(i, map, memo));
        }

        System.out.println(res);
    }

    public static int helper(int v, Map<Integer, List<Integer>> map, Map<Integer, Integer> memo) {
        if (memo.containsKey(v)) return memo.get(v);
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        int res = 0;
        for (int next : map.get(v)) {
            res = Math.max(res, 1 + helper(next, map, memo));
        }

        memo.put(v, res);
        return memo.get(v);
    }
}
