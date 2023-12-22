import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author CodeMonk
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int R = in.nextInt();
            int r[] = new int[m];
            for (int i = 0; i < R; i++)
                r[i] = in.nextInt();
            long[][] g = new long[n + 1][n + 1];
            for (int i = 0; i < m; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int c = in.nextInt();
                g[x][y] = c;
            }
            long[][] dist = new long[n + 1][n + 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dist[i][j] = g[i + 1][j + 1];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (g[i + 1][j + 1] == 0)
                        dist[i][j] = (int) 1E9;
                }
                dist[i][i] = 0;
            }


            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (dist[i][k] + dist[k][j] < dist[i][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                        }
                    }
                }
            }
       /* for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                out.print(dist[i][j]+" ");
            }
            out.println();
        }*/
            long ans = 0;
            for (int i = 0; i < R - 1; i++) {
                long mi = Integer.MAX_VALUE;
                for (int j = i + 1; j < R; j++) {
                    mi = Math.min(mi, dist[r[i] - 1][r[j] - 1]);
                }
                //out.println(mi);
                ans += mi;
            }

            out.println(ans);
        }

    }
}

