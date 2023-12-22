import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {

        int N = nextInt();
        ArrayList<Integer>[] adj = new ArrayList[N+1];
        for(int i = 0; i <= N; ++i) adj[i] = new ArrayList<>();
        for(int i = 0; i < N - 1; ++i) {
            int a = nextInt();
            int b = nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        int[] distA = new int[N + 1];
        int[] distB = new int[N + 1];
        Arrays.fill(distA, 1 << 30);
        Arrays.fill(distB, 1 << 30);

        distA[1] = 0;
        distB[N] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        while(!q.isEmpty()) {
            int v = q.poll();
            for(int to : adj[v]) {
                if(distA[to] > distA[v] + 1) {
                    distA[to] = distA[v] + 1;
                    q.offer(to);
                }
            }
        }
        q.offer(N);
        while(!q.isEmpty()) {
            int v = q.poll();
            for(int to : adj[v]) {
                if(distB[to] > distB[v] + 1) {
                    distB[to] = distB[v] + 1;
                    q.offer(to);
                }
            }
        }
        int A = 0;
        int B = 0;
        for(int i = 1; i <= N; ++i) {
            if(distA[i] <= distB[i]) ++A;
            else ++B;
        }
        if(A > B) {
            writer.println("Fennec");
        } else if(B > A) {
            writer.println("Snuke");
        } else {
            if(N == 2) {
                writer.println("Snuke");
            } else {
                if(N%2 == 0) {
                    writer.println("Snuke");
                } else writer.println("Fennec");
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