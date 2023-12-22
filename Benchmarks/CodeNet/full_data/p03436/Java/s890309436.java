import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    int h, w;
    boolean[][] dat;
    static final int INF = Integer.MAX_VALUE >> 1;
    int sum;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        dat = new boolean[h][w];
        sum = 0;
        sc.nextLine();
        for (int i = 0; i < h; i++) {
            char[] line = sc.nextLine().toCharArray();
            for (int j = 0; j < w; j ++) {
                dat[i][j] = line[j] == '.';
                if (!dat[i][j])
                    sum++;
            }
        }
    }

    private void solve() {
        int[][] memo = new int[h][w];
        for (int i = 0; i < h; i++)
            Arrays.fill(memo[i], INF);
        PriorityQueue<Vertex> queue
                = new PriorityQueue<>(Comparator.comparing(Vertex::getCost));
        queue.add(new Vertex(0, 0, 1));
        memo[0][0] = 1;
        while (!queue.isEmpty()) {
            Vertex v = queue.poll();
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if (dx != 0 && dy != 0)
                        continue;
                    int c = v.col + dx;
                    int r = v.row + dy;
                    if (0 <= c && c < h && 0 <= r && r < w
                            && dat[c][r] && memo[c][r] == INF) {
                        queue.add(new Vertex(c, r, v.cost+1));
                        memo[c][r] = v.cost + 1;
                    }
                }
            }
        }
        if (memo[h-1][w-1] == INF) {
            System.out.println(-1);
        } else {
            System.out.println((h * w) - sum - memo[h-1][w-1]);
        }
    }

    private class Vertex {
        int col;
        int row;
        int cost;
        Vertex (int i, int j, int c) {
            col = i; row = j; cost = c;
        }

        public int getCost() {
            return cost;
        }
    }
}
