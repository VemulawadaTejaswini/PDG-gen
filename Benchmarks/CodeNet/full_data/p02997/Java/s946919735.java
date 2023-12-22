import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] degs = new int[N];
        Arrays.fill(degs, 2);
        degs[0] = degs[N-1] = 1;
        int num = N-2;
        boolean moved = true;
        while(moved && num < K) {
            moved = false;
            int ind;
            int lost = 0;
            for(ind = 0; ind < N; ind++) {
                if (degs[ind] == 1) {
                    degs[ind]--;
                    if (ind + 1 < N && degs[ind + 1] > 0) {
                        degs[ind + 1]--;
                        lost = degs[ind + 1];
                    }
                    if (ind - 1 >= 0 && degs[ind -1] > 0) {
                        degs[ind -1] --;
                        lost = degs[ind -1];
                    }
                    break;
                }
            }
            if (ind == N) continue;
            int bestVal = -1;
            int best = -1;
            int nextNum = num - lost;
            for(int i = 0; i < N; i++) {
                int t = nextNum + degs[i];
                if ( t<= K && t > bestVal) {
                    best = i;
                    bestVal = t;
                }
            }
            if (bestVal >= num) {
                moved = true;
                degs[best]++;
                num = bestVal;
            }
        }
        ArrayList<Pair> list = new ArrayList<>();
        if (num != K) out.println(-1);
        else {
            int nextNode = 1;
            int carry = 0;
            for(int i = 0; i < N; i++) {
                int prev = degs[i];
                int cur = nextNode;
                while (degs[i] > carry) {
                    list.add(new Pair(cur, ++nextNode));
                    degs[i]--;
                }
                if (prev > 0) carry = 1;
            }
            out.println(list.size());
            for(Pair edge: list) {
                out.println(edge.a + " " + edge.b);
            }
        }
        out.flush();
    }
    
    static class Pair implements Comparable<Pair> {
        int a, b;
        public Pair(int aa, int bb) {
            a = aa; b = bb;
        }
        public int compareTo(Pair o) {
            if (b == o.b) return a - o.a;
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
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}
