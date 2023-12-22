import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int N = nextInt();
        final int Q = nextInt();
        final long[] C = new long[N]; // counter
        final int P[] = new int[N]; // parent
        Arrays.fill(P, -1);

        List<Integer>[] G = new List[N]; // Graph
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < N - 1; i++) {
            int a = nextInt() - 1;
            int b = nextInt() - 1;
            G[a].add(b);
            G[b].add(a);
        }

        for (int i = 0; i < Q; i++) {
            int p = nextInt() - 1;
            int x = nextInt();

            C[p] += x;
        }

        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        for (;!que.isEmpty();) {
            int v = que.poll();
            for (int w: G[v]) {
                if (w == P[v]) {
                    continue;
                }
                C[w] += C[v];
                P[w] = v;
                que.add(w);
            }
        }

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < N; i++) {
            out.append(C[i]).append(" ");
        }
        System.out.println(out.substring(0, out.length() - 1));
    }

    static int nextInt() {
        int c;
        try {
            c = System.in.read();
            while(c != '-' && (c < '0' || c > '9')) c = System.in.read();
            if(c == '-') return -nextInt();
            int res = 0;
            while(c >= '0' && c <= '9') {
                res = res * 10 + c - '0';
                c = System.in.read();
            }
            return res;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }
}