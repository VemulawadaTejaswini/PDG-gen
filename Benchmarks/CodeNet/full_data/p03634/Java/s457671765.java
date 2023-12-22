import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.Integer.parseInt;

public class Main {
    static class Element {
        long t, c;

        Element(long t, long c) {
            this.t = t;
            this.c = c;
        }
    }

    static int NN = 100007;
    static ArrayList<Long>[] G;
    static long z[];

    static void dfs(int v, long u, int p) {
        z[v] = u;
        for (int i = 0; i < G[v].size(); i++) {
            long qaq = G[v].get(i);
            int w = (int) (qaq >>> 32);
            if (w == p) continue;
            dfs(w, u + (int) qaq, v);
        }
    }

    public static void main(String[] args) throws IOException {
        //for(int i=0;i<NN;i++) G[i]=new ArrayList<Element>();
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        G = new ArrayList[n];
        z = new long[n];
        for (int i = 0; i < n; i++) G[i] = new ArrayList<Long>();

        for (int i = 0; i < n - 1; i++) {
            long a = sc.nextLong() - 1;
            long b = sc.nextLong() - 1;
            long c = sc.nextLong();

            G[(int) a].add(b << 32 | c);
            G[(int) b].add(a << 32 | c);
        }
        int q = sc.nextInt();
        n = sc.nextInt();
        dfs(n - 1, 0, -1);
        for (int j = 0; j < q; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            out.println(z[a - 1] + z[b - 1]);
        }
    }
}
