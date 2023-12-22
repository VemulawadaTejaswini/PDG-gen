import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static class edge {
        int from, to;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        edge[] es = new edge[m];
        for (int i = 0; i < m; i++) {
            str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]) - 1;
            int b = Integer.parseInt(str[1]) - 1;
            edge ed = new edge();
            ed.from = a;
            ed.to = b;
            es[i] = ed;
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE / 2);
        dist[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                edge ed = es[j];
                if (dist[ed.from] < Integer.MAX_VALUE / 3) dist[ed.to] = Integer.min(dist[ed.to], dist[ed.from] + 1);
                if (dist[ed.to] < Integer.MAX_VALUE / 3) dist[ed.from] = Integer.min(dist[ed.from], dist[ed.to] + 1);
            }
        }

        if (dist[n - 1] > 2) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println("POSSIBLE");
        }


    }

}
