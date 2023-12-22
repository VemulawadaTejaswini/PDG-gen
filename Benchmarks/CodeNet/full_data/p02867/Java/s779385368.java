import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int n = scanner.nextInt();
        int[] a = new int[n], aa = new int[n], b = new int[n], bb = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            aa[i] = a[i];
        }
        for(int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
            bb[i] = b[i];
        }
        Arrays.sort(aa);
        Arrays.sort(bb);
        for(int i = 0; i < n; i++) {
            if (aa[i] > bb[i]) {
                System.out.println("No");
                return;
            }
        }
        for(int i = 1; i < n; i++) {
            if (aa[i] <= b[i-1]) {
                System.out.println("Yes");
                return;
            }
        }
        HashMap<Integer, Integer> mapb = new HashMap<>();
        HashMap<Integer, Integer> mapa = new HashMap<>();
        for(int i = 0; i < n; i++) {
            mapa.put(aa[i], i);
            mapb.put(bb[i], i);
        }
        int[] perm = new int[n];
        for(int i = 0; i < n; i++) {
            perm[mapb.get(bb[i])] = mapa.get(aa[i]);
        }
        boolean[] vis = new boolean[n];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if (vis[i]) continue;
            int cur = i;
            do {
                vis[cur] = true;
                cur = perm[cur];
            } while(!vis[cur]);
            cnt++;
        }
        if (cnt == 1) System.out.println("No");
        else System.out.println("Yes");
        out.flush();
    }
    static class Pair implements Comparable<Pair> {
        int a, b;
        public Pair(int aa, int bb) {
            a = aa; b = bb;
        }
        public int compareTo(Pair o) {
            return b - o.b;
        }
    }
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
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
        
        String readNextLine() {
            String str = "";
            try {
                stimport java.util.*;
import java.io.*;

public class Swaps {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int n = scanner.nextInt();
        int[] a = new int[n], aa = new int[n], b = new int[n], bb = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            aa[i] = a[i];
        }
        for(int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
            bb[i] = b[i];
        }
        Arrays.sort(aa);
        Arrays.sort(bb);
        for(int i = 0; i < n; i++) {
            if (aa[i] > bb[i]) {
                System.out.println("No");
                return;
            }
        }
        for(int i = 1; i < n; i++) {
            if (aa[i] <= b[i-1]) {
                System.out.println("Yes");
                return;
            }
        }
        HashMap<Integer, Integer> mapb = new HashMap<>();
        HashMap<Integer, Integer> mapa = new HashMap<>();
        for(int i = 0; i < n; i++) {
            mapa.put(aa[i], i);
            mapb.put(bb[i], i);
        }
        int[] perm = new int[n];
        for(int i = 0; i < n; i++) {
            perm[mapb.get(bb[i])] = mapa.get(aa[i]);
        }
        boolean[] vis = new boolean[n];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if (vis[i]) continue;
            int cur = i;
            do {
                vis[cur] = true;
                cur = perm[cur];
            } while(!vis[cur]);
            cnt++;
        }
        if (cnt == 1) System.out.println("No");
        else System.out.println("Yes");
        out.flush();
    }
    static class Pair implements Comparable<Pair> {
        int a, b;
        public Pair(int aa, int bb) {
            a = aa; b = bb;
        }
        public int compareTo(Pair o) {
            return b - o.b;
        }
    }
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
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
        
        String readNextLine() {
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
r = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
