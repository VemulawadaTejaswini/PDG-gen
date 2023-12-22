package AtCoder.Indeed10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static int n,m,s,t;
    static List[] graph;

    static class nodeE {
        int node; int weight;
        nodeE(int node, int weight) {
            this.node = node; this.weight = weight;
        }
    }

    static class pathDis {
        long[] dis;
        long[] paths;
        pathDis(long[] dis, long[] paths) {
            this.dis = dis; this .paths = paths;
        }
    }

    static pathDis shortest(int node) {
        long[] pathlen = new long[n]; long[] ways = new long[n];

        Arrays.fill(pathlen, Integer.MAX_VALUE);
        Arrays.fill(ways, 0);

        PriorityQueue<nodeE> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
        HashSet<Integer> coveredNodes = new HashSet<>();

        pq.add(new nodeE(node, 0));

        while(pq.size() > 0) {
            nodeE topNode = pq.poll();
            if (coveredNodes.contains(topNode.node)) continue;

            pathlen[topNode.node] = topNode.weight;
            coveredNodes.add(topNode.node);
            long totalways = 0;
            for (nodeE neighbour: (List<nodeE>) graph[topNode.node]) {
                if (coveredNodes.contains(neighbour.node) && pathlen[neighbour.node] + neighbour.weight == topNode.weight) totalways += ways[neighbour.node];
                if (pathlen[neighbour.node] > topNode.weight + neighbour.weight) {
                    pq.add(new nodeE(neighbour.node, topNode.weight + neighbour.weight));
                }
            }
            if (totalways == 0) { // source node
                totalways++;
            }

            ways[topNode.node] = totalways;
        }

        return new pathDis(pathlen, ways);
    }

    public static void main(String[] args) {
        n = in.NI(); m = in.NI(); s = in.NI()-1; t = in.NI()-1;
        graph = new List[n];
        for (int i=0;i<n;i++) graph[i] = new ArrayList<nodeE>();
        for (int i=0;i<m;i++) {
            int u = in.NI()-1; int v = in.NI()-1; int w = in.NI();
            graph[u].add(new nodeE(v,w));
            graph[v].add(new nodeE(u,w));
        }

        pathDis destPathDis = shortest(t);
        pathDis sourcePathDis = shortest(s);

        long totans = sourcePathDis.paths[t] * sourcePathDis.paths[t];
        long shortestPathDis = sourcePathDis.dis[t];

        for (int i=0;i<n;i++) {
            if (sourcePathDis.dis[i] == shortestPathDis/2 && destPathDis.dis[i] == shortestPathDis/2) totans--;
        }

        long tsub = 0;
/*        for (int i=0;i<n;i++) {
            for (nodeE neigh: (List<nodeE>) graph[i]) {
                int n1 = i; int n2 = neigh.node;
                if (Math.abs(sourcePathDis.dis[n2] - sourcePathDis.dis[n1]) != (double)neigh.weight) continue;

                double s1 = sourcePathDis.dis[n1]; double s2 = sourcePathDis.dis[n2];
                double d1 = destPathDis.dis[n1]; double d2 = destPathDis.dis[n2];

                long sourcepath = 0; long destpath = 0;
                if (s1<s2) {
                    sourcepath = sourcePathDis.paths[n1];
                } else {
                    sourcepath = sourcePathDis.paths[n2];
                }

                if (d1<d2) {
                    destpath = destPathDis.paths[n1];
                } else {
                    destpath = destPathDis.paths[n2];
                }

                double ss = Math.min(s1,s2) + 0.001; double se = Math.max(s1,s2) - 0.001;
                double ds = Math.min(d1,d2) + 0.001; double de = Math.max(d1,d2) - 0.001;
                //if ((ds>ss && ds<se) || (de>ss && de<se) || (ss>ds && ss<de) || (se>ds && se<de)) tsub++;
                if (de<ss || ds>se) continue;
                tsub += sourcepath*destpath;
            }
        }*/

        for (int i=0;i<n;i++) {
            for (nodeE neigh: (List<nodeE>) graph[i]) {
                long d1 = sourcePathDis.dis[i]; long d2 =  destPathDis.dis[neigh.node];
                long w = neigh.weight;

                if (d1<shortestPathDis/2 && d2<shortestPathDis/2 && d1+d2+w==shortestPathDis) {
                    totans-=(sourcePathDis.paths[i]*destPathDis.paths[neigh.node]);
                }
            }
        }
        tsub/=2;
        totans-=tsub;
        out.println(totans);

        out.close();
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NI() {
            return Integer.parseInt(next());
        }

        public long NL() {
            return Long.parseLong(next());
        }

    }
}