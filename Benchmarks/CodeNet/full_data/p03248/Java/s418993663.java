import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        String s = sc.next();
        int n = s.length();
        int [] c = new int[n + 1];
        for (int i = 1; i <= n; i++) c[i] = s.charAt(i - 1) - '0';
        if (c[n] == 1 || c[1] == 0 || c[n - 1] == 0) {
            out.println(-1);
            out.close();
            return;
        }
        boolean ok = true;
        for (int i = 1; i <= n - 1; i++) if (c[i] != c[n - i]) ok = false;
        if (!ok) {
            out.println(-1);
            out.close();
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i < n; i++) if (c[i] == 1) a.add(i);
        ArrayList<Edge> res = new ArrayList<>();
        int root = 1; int sz = n; int cur = 2;
        Collections.sort(a, Comparator.reverseOrder());
        int idx = 0;
        while (idx < a.size()) {
            for (int i = 0; i < sz - a.get(idx) - 1; i++) {
                res.add(new Edge(root, cur++));
            }
            int nextRoot = cur;
            res.add(new Edge(root, cur++));
            root = nextRoot; sz = a.get(idx);
            ++idx;
        }
        for (Edge e: res) out.println(e.a + " " + e.b);
        out.close();
    }

    static class Edge {
        int a; int b;
        Edge(int a, int b) {
            this.a = a; this.b = b;
        }
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
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
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}