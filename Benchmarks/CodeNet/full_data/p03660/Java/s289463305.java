import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Integer>[] edge = new List[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < N-1; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            edge[a].add(b);
            edge[b].add(a);
        }
        int[] black = this.bfs(edge, 0);
        int[] white = this.bfs(edge, N-1);
        HashSet<Integer> used = new HashSet<>();
        PriorityQueue<Pair> blacks = new PriorityQueue<>(new PairComparator());
        blacks.add(new Pair(0, Integer.MAX_VALUE));
        PriorityQueue<Pair> whites = new PriorityQueue<>(new PairComparator());
        whites.add(new Pair(N-1, Integer.MAX_VALUE));
        for (int i = 0; i < N; i++) {
            PriorityQueue<Pair> queue = blacks;
            int[] point = white;
            String winner = "Snuke";
            if (i % 2 != 0) {
                queue = whites;
                point = black;
                winner = "Fennec";
            }
            boolean done = false;
            while(!queue.isEmpty()) {
                Pair p = queue.poll();
                if (used.contains(p.index)) {
                    continue;
                }
                used.add(p.index);
                done = true;
                for (int next : edge[p.index]) {
                    if (used.contains(next)) {
                        continue;
                    }
                    queue.add(new Pair(next, point[next]));
                }
                break;
            }
            if (!done) {
                System.out.println(winner);
                return;
            }
        }
    }
    private int[] bfs(List<Integer>[] edge, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        int[] distance = new int[edge.length];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;
        while(!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : edge[current]) {
                if (distance[current] + 1 < distance[next]) {
                    distance[next] = distance[current] + 1;
                    queue.add(next);
                }
            }
        }
        return distance;
    }
    class Pair {
        int index;
        int value;
        Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.value != o2.value) {
                return Integer.compare(o1.value, o2.value);
            }
            return Integer.compare(o1.index, o2.index);
        }
    }
}
