import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static class Edge {
        int l, r;
        int x[];

        public Edge(int l, int r, int x[]) {
            this.l = l;
            this.r = r;
            this.x = x;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int data[][] = new int[n][n];
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();
            data[l - 1][r - 1] = d;
            data[r - 1][l - 1] = -d;
        }

        Queue<Edge> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[i][j] != 0) {
                    boolean isAdd = true;
                    for (int k = 0; k < j; k++) {
                        if (data[j][k] != 0) {
                            isAdd = false;
                            break;
                        }
                    }

                    if (isAdd) {
                        int x[] = new int[n];
                        x[i] = 0;
                        x[j] = data[i][j];
                        queue.add(new Edge(i, j, x));
                    }
                }
            }
        }

        boolean flg = true;
        LOOP: while (!queue.isEmpty()) {
            Edge e = queue.poll();
            for (int i = 0; i < n; i++) {
                if (data[e.r][i] != 0) {
                    if (e.x[i] != 0) {
                        if (e.x[i] - e.x[e.r] != data[e.r][i]) {
                            flg = false;
                            break LOOP;
                        }
                    } else {
                        e.x[i] = e.x[e.r] + data[e.r][i];
                        queue.add(new Edge(e.r, i, e.x));
                    }
                }
            }
        }
        System.out.println(flg ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
