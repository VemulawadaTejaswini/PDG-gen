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
            path = new boolean[N][N];
            distance = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    path[i][j] = true;
                }
            }
            for (int i = 0; i < M; i++) {
                int a = scanner.nextInt() - 1;
                int b = scanner.nextInt() - 1;
                int c = scanner.nextInt();
                distance[a][b] = c;
            }

            for (int i = 0; i < N; i++) {
                int vertex1 = i;
                for (int j = i + 1; j < N; j++) {
                    int vertex2 = j;
                    shortestPath(vertex1, vertex2);
                }
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!path[i][j]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
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
                if (n == j) {
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