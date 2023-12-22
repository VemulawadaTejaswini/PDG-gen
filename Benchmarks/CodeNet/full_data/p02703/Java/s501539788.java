import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt(); int s = sc.nextInt();
        ArrayList<Node> [] adj = new ArrayList[n+1]; long maxA = 0;
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); int v = sc.nextInt();
            int a = sc.nextInt(); int b = sc.nextInt();
            maxA = Math.max(a, maxA);
            adj[u].add(new Node(v, b, a));
            adj[v].add(new Node(u, b, a));
        }
        long [] c = new long [n+1]; long [] d = new long [n+1];
        for (int i = 1; i <= n; i++) {
            c[i] = sc.nextLong(); d[i] = sc.nextLong();
        }
        long [][] ans = new long [n+1][(int) (n * maxA + 3)];
        for (long [] arr: ans) Arrays.fill(arr, Long.MAX_VALUE);
        PriorityQueue<State> q = new PriorityQueue<>();
        q.add(new State(1, s, 0));
        long [] max = new long [n+1];
        Arrays.fill(max, Long.MAX_VALUE);
        while (!q.isEmpty()) {
            State toDo = q.poll();
            ans[toDo.index][(int)Math.min(toDo.coin, n * maxA + 2)] = Math.min(ans[toDo.index][(int)Math.min(toDo.coin, n * maxA + 2)], toDo.time);
            max[toDo.index] = Math.min(max[toDo.index], ans[toDo.index][(int)Math.min(toDo.coin, n * maxA + 2)]);
            long finish = 0;
            for (int i = 1; i <= n; i++) finish = Math.max(max[i], finish);
            if (finish <= toDo.time) break;
            for (int ex = 0; ex <= n * maxA; ex++) {
                for (Node next: adj[toDo.index]) {
                    long transaction = ex * d[toDo.index];
                    long temp = toDo.coin + ex * c[toDo.index];
                    if (temp >= next.cost && transaction + toDo.time + next.time < ans[next.index][(int)Math.min(temp - next.cost, n * maxA + 2)]) {
                        q.add(new State(next.index, temp - next.cost, transaction + toDo.time + next.time));
                    }
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            long best = Long.MAX_VALUE;
            for (int j = 0; j <= n * maxA + 2; j++) best = Math.min(best, ans[i][j]);
            System.out.println(best);
        }
    }

    static class Node {
        int index; int time; int cost;
        Node(int index, int time, int cost) {
            this.time = time; this.index = index; this.cost = cost;
        }
    }

    static class State implements Comparable<State> {
        int index; long coin; long time;
        State(int index, long coin, long time) {
            this.index = index; this.coin = coin; this.time = time;
        }

        @Override
        public int compareTo(State o) {
            return Long.compare(time, o.time);
        }
    }




}