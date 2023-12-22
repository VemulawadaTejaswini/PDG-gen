import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static class action {
        int from, to;

        action(int a, int b) {
            this.from = a;
            this.to = b;
        }
    }

    public static class edge {
        int to;
        long cost;

        edge(int b, long c) {
            this.to = b;
            this.cost = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(br.readLine());
        ArrayList[] edges = new ArrayList[n];
        for (int i = 0; i < n; i++) edges[i] = new ArrayList();

        for (int i = 0; i < n - 1; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]) - 1;
            int b = Integer.parseInt(str[1]) - 1;
            long c = Long.parseLong(str[2]);

            edge ed = new edge(b, c);
            edges[a].add(ed);
            ed = new edge(a, c);
            edges[b].add(ed);
        }

        String[] str = br.readLine().split(" ");
        int q = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]) - 1;
        long[] dist = new long[n];
        boolean[] reached = new boolean[n];
        Arrays.fill(reached, false);
        dist[k] = 0;
        reached[k] = true;

        ArrayDeque<Integer> que = new ArrayDeque();
        que.add(k);
        while(!que.isEmpty()){
            int node = que.poll();
            for(Object t: edges[node]){
                edge e = (edge) t;
                if(reached[e.to]) continue;

                dist[e.to] = dist[node] + e.cost;
                que.add(e.to);
                reached[e.to] = true;
            }

        }


        for (int i = 0; i < q; i++) {
            str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]) - 1;
            int y = Integer.parseInt(str[1]) - 1;
            System.out.println(dist[x] + dist[y]);
        }
    }
}
