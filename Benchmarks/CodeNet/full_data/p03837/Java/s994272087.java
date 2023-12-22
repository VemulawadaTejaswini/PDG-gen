import java.io.*;
import java.util.*;
public class Main {
    private static MyScanner scanner;
    private boolean[][] path;
    private int[][] distance;
 
    public static void main (String[] args){
        Main instance = new Main();
        scanner = instance.new MyScanner();
        instance.solve();
    }
 
    private void solve() {
        try {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] a = new int[M];
            int[] b = new int[M];
            int[] c = new int[M];
            int[][] dist = new int[M][M];
            for (int i = 0; i < M; i++) {
                a[i] = scanner.nextInt();
                b[i] = scanner.nextInt();
                c[i] = scanner.nextInt();
            }

            for (int i = 0; i < m; i++) {
                dist[a[i]][b[i]] = Math.min(dist[a[i]][b[i]], c[i]);
                dist[b[i]][a[i]] = Math.min(dist[b[i]][a[i]], c[i]);
            }

            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }

            int ans = M;
            for (int i = 0; i < M; i++) {
                boolean shortest = false;
                for (int j = 0; j < M; j++) {
                    if (dist[j][a[i]] + c[i] == dist[j][b[i]]) {
                        shortest = true;
                    }
                    if (shortest) {
                        ans--;
                    }
                }
            }
            System.out.println(ans);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void shortestPath (int i, int j) {
        int now = i;
        while (now != j) {
            int index = now + 1;
            int min = distance[now][index];
            for (int n = index; n < distance[now].length; n++) {
                if (distance[now][n] != 0 && n == j) {
                    path[now][n] = true;
                    return;
                }
                if (distance[now][n] < min) {
                    min = distance[now][n];
                    index = n;
                }
            }
            path[now][index] = true;
            now = index;
        }
    }

 
    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";
 
        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String line = br.readLine();
            while (line.equals("")) {
                line = br.readLine();
            }
            s = line.split(reg, 0);
            i = 0;
            return s[i++];
        }
 
        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }
 
        public double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
 
        public long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }
    }
}