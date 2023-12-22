import java.util.Scanner;

public class Main {
    private final static int B = 10;
    int h, w;
    int[][] graph = new int[B][B];
    int[][] as;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        as = new int[h][w];
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < B; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                as[i][j] = sc.nextInt();
            }
        }
    }

    private void solve() {
        dp();
        long ret = 0L;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (as[i][j] == -1 || as[i][j] == 1)
                    continue;
                ret += graph[as[i][j]][1];
            }
        }
        System.out.println(ret);
    }

    private void dp() {
        for (int k = 0; k < B; k++) {
            for (int i = 0; i < B; i++) {
                for (int j = 0; j < B; j++) {
                    graph[i][j] = Math.min(graph[i][j],
                            graph[i][k] + graph[k][j]);
                }
            }
        }
    }
}
