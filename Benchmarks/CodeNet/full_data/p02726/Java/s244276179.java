import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] g;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken())-1;
        int y = Integer.parseInt(st.nextToken())-1;
        g = new int[n][n];
        for(int[] R : g) {
            Arrays.fill(R, INF);
        }
        for (int i = 0; i < n; i++) {
            g[i][i] = 0;
        }
        for (int i = 0; i < n-1; i++)
        {
            g[i][i+1] = 1;
            g[i+1][i] = 1;
        }
        g[x][y] = 1;
        g[y][x] = 1;
        int[][] dist = floydWarshall(g, n);
        HashMap<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                pairs.put(dist[i][j], 1+pairs.getOrDefault(dist[i][j], 0));
            }
        }
        for (int k = 1; k < n; k++) {
            System.out.println(pairs.getOrDefault(k, 0));
        }
    }

    static int INF = 1000000;
    static int[][] floydWarshall(int[][] G, int nVertex) {
        int[][] dist = new int[nVertex][nVertex];

        for (int i = 0; i < nVertex; i++)
            for (int j = 0; j < nVertex; j++)
                dist[i][j] = G[i][j];

        for (int k = 0; k < nVertex; k++) {
            for (int i = 0; i < nVertex; i++) {
                for (int j = 0; j < nVertex; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
        return dist;
    }

}
