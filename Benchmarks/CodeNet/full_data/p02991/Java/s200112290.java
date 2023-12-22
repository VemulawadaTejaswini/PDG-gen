import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<Integer, List<Integer>> _all_edges = new HashMap<Integer, List<Integer>>();
        Map<Integer, List<int[]>> all_edges = new HashMap<Integer, List<int[]>>();
        for (int i=0;i<N;i++) {
            _all_edges.put(i, new ArrayList<Integer>());
            all_edges.put(i, new ArrayList<int[]>());
        }

        for (int i=0;i<M;i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            _all_edges.get(u).add(v);
        }

        for (int i=0;i<N;i++) {
            ArrayList<Integer> a = dep3(_all_edges, i);
//            System.out.println(a);
            for (int b: a) {
                all_edges.get(i).add(new int[] {i, b, 1});
            }
        }

        int S = sc.nextInt();
        int T = sc.nextInt();

        int distance = dijkstra(all_edges, S-1, T-1, N);
        int ans = -1;

        if (distance > 0) {
            ans = distance;
        }

        out.println(ans);
        out.flush();
    }

    public static ArrayList<Integer> dep3(Map<Integer, List<Integer>> all_edges, int start) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(start);

        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i=0;i<3;i++) {
            for (int s: a) {
                for (int t: all_edges.get(s)) {
                    b.add(t);
                }
            }

            a = new ArrayList<Integer>(new HashSet<>(b));
            b.clear();
        }

        return a;
    }


    public static int dijkstra(Map<Integer, List<int[]>> all_edges, int start, int end, int max_node_number) {
        int[] distance = new int[max_node_number+1];
        for(int i=0;i<distance.length;i++) distance[i] = -1;
        PriorityQueue<int[]> p_que = new PriorityQueue<>((a,b)->((distance[a[0]]+a[2])-(distance[b[0]]+b[2])));
        distance[start] = 0;
        List<int[]> edges = all_edges.get(start);
        for(int i=0;i<edges.size();i++) p_que.add(edges.get(i));
        while(p_que.isEmpty() == false) {
            int[] nearest_edge = p_que.poll();
            if (nearest_edge == null) continue;
            if(distance[nearest_edge[1]]<0) {
                distance[nearest_edge[1]] = distance[nearest_edge[0]] + nearest_edge[2];
                if(all_edges.containsKey(nearest_edge[1])) {
                    edges = all_edges.get(nearest_edge[1]);
                    for(int i=0;i<edges.size();i++) {
                        int[] edge = edges.get(i);
                        if(distance[edge[1]]<0) p_que.add(edge);
                    }
                }
            }
        }

        return distance[end];
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }

        int[] nextIntArray(int N) {
            int a[] = new int[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextInt();
            }

            return a;
        }

        long[] nextLongArray(int N) {
            long a[] = new long[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextLong();
            }

            return a;
        }

        double[] nextDoubleArray(int N) {
            double a[] = new double[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextDouble();
            }

            return a;
        }

        String[] nextTokenArray(int N) {
            String a[] = new String[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextToken();
            }

            return a;
        }
    }
}