import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {


        long start = 0L;

        while(true) {

            int low = 0;
            int high = 9;

            int best = -1;
            while(low <= high) {
                int mid = low + ( high - low ) / 2;

                if(mid == 0 && start == 0) {
                    low = mid + 1;
                    continue;
                }
                long temp = start*10 + mid;
                writer.println("? "+temp);
                writer.flush();

                String ans = reader.readLine();
                if(ans.equals("Y")) {
                    best = Math.max(best, mid);
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if(best == -1) {
                writer.println("! " + start);
                writer.flush();
                break;
            } else {

                start = start*10 + best;
            }
        }
    }


    static class Edge implements Comparable<Edge> {
        int a;
        int b;
        int c;

        public Edge(int a,int b,int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public int compareTo(Edge o) {
            return o.c - this.c;
        }
    }
    static class UF {
        int N;
        int[] rank;
        int[] elem;

        public UF(int N) {
            this.N = N;
            this.rank = new int[N];
            this.elem = new int[N];
            for(int i = 0; i < N; ++i) {
                elem[i] = i;
                rank[i] = 1;
            }
        }

        public int getRoot(int x) {
            if(elem[x] == x) return x;
            else return elem[x] = getRoot(elem[x]);
        }

        public boolean isSame(int x,int y) {
            return getRoot(x) == getRoot(y);
        }

        public void union(int x,int y) {
            int xRoot = getRoot(x);
            int yRoot = getRoot(y);
            if(rank[xRoot] > rank[yRoot]) {
                rank[xRoot] += rank[yRoot];
                elem[yRoot] = xRoot;
            } else {
                rank[yRoot] += rank[xRoot];
                elem[xRoot] = yRoot;
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader reader;
    //    BufferedReader reader2;
    StringTokenizer tokenizer;
    PrintWriter writer;
    //    BufferedWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//            reader = new BufferedReader(new FileReader("input.txt"));
            //            reader2 = new BufferedReader(new FileReader("1.in"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new     PrintWriter("output.txt");
//                                                    writer = new BufferedWriter(System.out);
            //                        writer = new BufferedWriter(new OutputStreamWriter(System.out));
            solve();
            reader.close();
            //            reader2.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    short nextShort() throws IOException {
        return Short.parseShort(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }

}