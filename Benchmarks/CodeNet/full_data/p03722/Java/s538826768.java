import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static class edge {
        int from, to;
        long cost;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        edge[] es = new edge[m];
        for(int i=0; i<m; i++){
            str = br.readLine().split(" ");
            edge ed = new edge();
            ed.from = Integer.parseInt(str[0]) - 1;
            ed.to = Integer.parseInt(str[1]) - 1;
            ed.cost = -Long.parseLong(str[2]);
            es[i] = ed;
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE / 2);
        dist[0] = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                edge ed = es[j];
                if(dist[ed.from] < Long.MAX_VALUE / 3)
                    dist[ed.to] = Long.min(dist[ed.to], dist[ed.from] + ed.cost);
            }
        }

        long ans = dist[n-1];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                edge ed = es[j];
                if(dist[ed.from] < Long.MAX_VALUE / 3)
                    dist[ed.to] = Long.min(dist[ed.to], dist[ed.from] + ed.cost);
            }
        }

        if(ans != dist[n-1]) System.out.println("inf");
        else System.out.println(-ans);
    }

}
