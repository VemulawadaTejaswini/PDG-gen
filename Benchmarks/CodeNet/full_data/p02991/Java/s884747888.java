import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static final long MOD = 1000000007;
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");
        final int n = Integer.parseInt(split[0]);
        final int m = Integer.parseInt(split[1]);

        List<Integer>[] list = new List[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            split = scanner.nextLine().split(" ");
            final int a = Integer.parseInt(split[0]) - 1;
            final int b = Integer.parseInt(split[1]) - 1;
            list[a].add(b);
        }
        split = scanner.nextLine().split(" ");
        final int S = Integer.parseInt(split[0]) - 1;
        final int T = Integer.parseInt(split[1]) - 1;
        final int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[S] = 0;
        final Queue<Integer> q = new LinkedList<>();
        q.add(S);
        while(!q.isEmpty()) {
            final int s = q.poll();
            final int nextStep = dp[s] + 1;
            /*
            for (final int next : list[s]) {
                if (nextStep < dp[next]) {
                    dp[next] = nextStep;
                    q.add(next);
                }
            }*/
            for (final int n1 : list[s]) {
                for (final int n2 : list[n1]) {
//                    if ((n2 == n1) || (n2 == s)) {
//                        continue;
//                    }
                    for (final int n3 : list[n2]) {
//                        if ((n3 == n2) || (n3 == n1) || (n3 == s)) {
//                            continue;
//                        }
                        if (nextStep < dp[n3]) {
                            dp[n3] = nextStep;
                            q.add(n3);
                        }
                    }
                }
            }
        }
        //System.out.println(Arrays.toString(dp));

        if (dp[T] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dp[T]);
        }
    }
}
