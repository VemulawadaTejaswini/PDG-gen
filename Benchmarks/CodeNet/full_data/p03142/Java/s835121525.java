import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /*new Thread(null, new Runnable() {
            @Override
            public void run() {
                try {
                    new Solver().solve();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }, "Solver", 1l << 30).start();*/

        new Solver().solve();
    }
}

class Solver {
    IO io = new IO(System.in, System.out);

    int N, M;
    ArrayList<Integer>[] graph;
    HashSet<Integer>[] parent;
    int[] ans;

    void solve() throws Exception {
        int i, j, k;

        N = io.nextInt(); M = io.nextInt();
        graph = new ArrayList[N];
        parent = new HashSet[N];
        for (i = 0; i < N; ++i) {
            graph[i] = new ArrayList<>();
            parent[i] = new HashSet<>();
        }
        ans = new int[N]; Arrays.fill(ans, -1);

        for (i = 0; i < N - 1 + M; ++i) {
            int a = io.nextInt() - 1, b = io.nextInt() - 1;
            graph[a].add(b);
            parent[b].add(a);
        }

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (i = 0; i < N; ++i) if (parent[i].isEmpty()) break;
        if (i >= N) System.exit(1);
        dq.addLast(i);

        while (!dq.isEmpty()) {
            //System.out.println(dq);

            int root = dq.pollFirst();
            for (int itr : graph[root]) {
                //System.out.println(itr + " " + parent[itr]);

                parent[itr].remove(root);
                if (parent[itr].isEmpty()) {
                    ans[itr] = root;
                    dq.addLast(itr);
                }
            }
        }

        for (int itr : ans) io.println(++itr);

        io.flush();
    }
}


class IO {
    static byte[] buf = new byte[2048];
    static int index, total;
    static InputStream in;
    static BufferedWriter bw;


    IO(InputStream is, OutputStream os) {
        try {
            in = is;
            bw = new BufferedWriter(new OutputStreamWriter(os));
        } catch (Exception e) {
        }
    }

    IO(String inputFile, String outputFile) {
        try {
            in = new FileInputStream(inputFile);
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outputFile)));
        } catch (Exception e) {
        }
    }

    int scan() throws Exception {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0)
                return -1;
        }
        return buf[index++];
    }

    String next() throws Exception {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan())
            sb.append((char) c);
        return sb.toString();
    }

    int nextInt() throws Exception {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    long nextLong() throws Exception {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    void print(Object a) throws Exception {
        bw.write(a.toString());
    }

    void println() throws Exception {
        bw.write("\n");
    }

    void println(Object a) throws Exception {
        print(a);
        println();
    }

    void flush() throws Exception {
        bw.flush();
        bw.close();
    }
}