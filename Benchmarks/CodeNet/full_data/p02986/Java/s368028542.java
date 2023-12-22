import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        int Q = sc.nextInt();
        ArrayList[] links = new ArrayList[N];
        ArrayList<Integer> parents_list[] = new ArrayList[N];
        for (int i=0;i<N;i++) {
            links[i] = new ArrayList<Link>();
            parents_list[i] = new ArrayList<Integer>();
        }

        for (int i=0;i<N-1;i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            int d = sc.nextInt();
            links[a].add(new Link(b, c, d));
            links[b].add(new Link(a, c, d));
        }

//        int distance[][] = new int[N][N];
//        int num[][] = new int[N][N];
        HashMap<Integer, Integer> distance[] = new HashMap[N];
        HashMap<Integer, Integer> num[] = new HashMap[N];
      for (int i=0;i<N;i++) {
          distance[i] = new HashMap<Integer, Integer>();
          num[i] = new HashMap<Integer, Integer>();
      }
//
        int total_distance[] = new int[N];

        calc_distance(0, -1, num, distance, total_distance, links, parents_list);
//        for (int i=0;i<N;i++) {
//            for (int j=0;j<N;j++) {
//                out.printf("%5d ", distance[i][j]);
//            }
//            out.println();
//        }
//
//        out.println();
//        for (int i=0;i<N;i++) {
//            out.printf("%5d ", total_distance[i]);
//            out.println();
//        }
//
//        for (int i=0;i<N;i++) {
//            for (int j=0;j<N;j++) {
//                out.printf("%5d ", num[i][j]);
//            }
//            out.println();
//        }

        for (int i=0;i<Q;i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt();
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;

            int p = 0;
            if (u != 0 && v != 0) p = same_parent(u, v, parents_list);

            long ans = total_distance[u] + total_distance[v] - total_distance[p] * 2;
            int d1 = 0;
            if (distance[u].containsKey(x)) d1 = distance[u].get(x);

            int d2 = 0;
            if (distance[v].containsKey(x)) d2 = distance[v].get(x);

            int d3 = 0;
            if (distance[p].containsKey(x)) d3 = distance[p].get(x);

            int n1 = 0;
            if (num[u].containsKey(x)) n1 = num[u].get(x);

            int n2 = 0;
            if (num[v].containsKey(x)) n2 = num[v].get(x);

            int n3 = 0;
            if (num[p].containsKey(x)) n3 = num[p].get(x);

            ans -= d1 + d2 - d3 * 2;
            ans += (n1 + n2 - n3 * 2) * y;
            out.println(ans);
        }

        out.flush();
    }

    public static void calc_distance(int now, int parent, HashMap<Integer, Integer> num[], HashMap<Integer, Integer> distance[], int total_distance[],
            ArrayList<Link> links[],
            ArrayList<Integer> parents_list[]
                    ) {
        for (Link l: links[now]) {
            if (l.to == parent) continue;

            distance[l.to] = (HashMap<Integer, Integer>) distance[now].clone();
            if (distance[l.to].containsKey(l.color) == false) {
                distance[l.to].put(l.color, 0);
            }
            distance[l.to].put(l.color, distance[l.to].get(l.color) + l.distance);

            num[l.to] = (HashMap<Integer, Integer>) num[now].clone();
            if (num[l.to].containsKey(l.color) == false) {
                num[l.to].put(l.color, 0);
            }
            num[l.to].put(l.color, num[l.to].get(l.color) + 1);


            total_distance[l.to] = total_distance[now] + l.distance;

            parents_list[l.to] = (ArrayList<Integer>) parents_list[now].clone();
            parents_list[l.to].add(now);

            calc_distance(l.to, now, num, distance, total_distance, links, parents_list);
        }
    }

    /*
5 3
1 2 1 10
1 3 2 20
2 4 4 30
5 2 1 40
1 100  4 5
     */
    public static int same_parent(int a, int b, ArrayList<Integer> parents_list[]) {
        ArrayList<Integer> A = parents_list[a];
        ArrayList<Integer> B = parents_list[b];
        int l = 0;
        int ret = 0;
        int r = Math.min(A.size(), B.size()) - 1;

        while (true) {
            int mid = (l + r) / 2;
            if (A.get(mid) != B.get(mid)) {
                r = mid - 1;
            } else {
                ret = mid;
                l = mid + 1;
            }

            if (l > r) {
                break;
            }
        }

        return ret;
    }

    public static class Link {
        int to, color, distance;
        Link(int to, int color, int distance) {
            this.to = to;
            this.color = color;
            this.distance = distance;
        }
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