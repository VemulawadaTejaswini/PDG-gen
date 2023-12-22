/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        adjList = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adjList[u].add(v);
            adjList[v].add(u);
        }

        factorial = new long[N + 1];
        factorial[0] = 1;
        factInv = new long[N + 1];
        factInv[0] = 1;
        for (int i = 1; i <= N; i++) {
            factorial[i] = (factorial[i - 1] * (long) i) % mod;
            factInv[i] = fastExpo(factorial[i], mod - 2);
        }

        parent = new int[N];
        sub = new int[N];
        dfsSubtree(0, -1);
        arrangement = new long[N];
        dpDown = new long[N];

        solveDown(0, -1);

        dpTotal = new long[N];
        dpTotal[0] = dpDown[0];
        for (int adj : adjList[0]) {
            solveReroot(adj, 0);
        }

//        System.out.println(Arrays.toString(dp));

        for (long v : dpTotal) {
            out.println(v);
        }
        out.close();
    }

    static ArrayList<Integer>[] adjList;
    static int N;
    static int[] sub;
    static long[] factorial, factInv;
    static int[] parent;
    static long[] dpDown, dpTotal, arrangement;
    static long mod = (long) 1e9 + 7;

    static long dfsSubtree(int node, int par) {
        sub[node] = 1;
        parent[node] = par;
        for (int adj : adjList[node]) {
            if (adj == par) continue;
            sub[node] += dfsSubtree(adj, node);
        }
        return sub[node];
    }

    // this will return dp[node] as the ways to solve the subproblem
    // on this subtree
    static long solveDown(int node, int par) {
        long arrange = factorial[sub[node] - 1];
        long prod = 1;
        for (int adj : adjList[node]) {
            if (adj == par) continue;
            arrange = (arrange * factInv[sub[adj]]) % mod;
            prod = (prod * solveDown(adj, node)) % mod;
        }
        arrangement[node] = arrange;
        dpDown[node] = (arrange * prod) % mod;
        return dpDown[node];
    }

    static void solveReroot(int node, int par) {
        long res = (dpTotal[par] * inv(dpDown[node])) % mod;
        res = (res * factorial[sub[node]]) % mod;
        res = (res * inv(N - sub[node])) % mod;
        for (int adj : adjList[node]) {
            if (adj != par) {
                res = (res * dpDown[adj]) % mod;
                res = (res * inv(factorial[sub[adj]])) % mod;
            }
        }
        dpTotal[node] = res;
        for (int adj : adjList[node]) {
            if (adj != par) {
                solveReroot(adj, node);
            }
        }
    }

    static long inv(long x) {
        return fastExpo(x, mod - 2);
    }

    static long fastExpo(long x, long k) {
        if (k == 0) {
            return 1;
        }
        else if (k == 1) {
            return x;
        }
        else {
            long root = fastExpo(x, k / 2);
            long ans = (root * root) % mod;
            if (k % 2 == 1) {
                ans = (ans * x) % mod;
            }
            return ans;
        }
    }

    static class FastScanner {
        public int BS = 1<<16;
        public char NC = (char)0;
        byte[] buf = new byte[BS];
        int bId = 0, size = 0;
        char c = NC;
        double cnt = 1;
        BufferedInputStream in;

        public FastScanner() {
            in = new BufferedInputStream(System.in, BS);
        }

        public FastScanner(String s) {
            try {
                in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
            }
            catch (Exception e) {
                in = new BufferedInputStream(System.in, BS);
            }
        }

        private char getChar(){
            while(bId==size) {
                try {
                    size = in.read(buf);
                }catch(Exception e) {
                    return NC;
                }
                if(size==-1)return NC;
                bId=0;
            }
            return (char)buf[bId++];
        }

        public int nextInt() {
            return (int)nextLong();
        }

        public int[] nextInts(int N, int dx) {
            int[] res = new int[N];
            for (int i = 0; i < N; i++) {
                res[i] = (int) nextLong() + dx;
            }
            return res;
        }

        public long[] nextLongs(int N) {
            long[] res = new long[N];
            for (int i = 0; i < N; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long nextLong() {
            cnt=1;
            boolean neg = false;
            if(c==NC)c=getChar();
            for(;(c<'0' || c>'9'); c = getChar()) {
                if(c=='-')neg=true;
            }
            long res = 0;
            for(; c>='0' && c <='9'; c=getChar()) {
                res = (res<<3)+(res<<1)+c-'0';
                cnt*=10;
            }
            return neg?-res:res;
        }

        public double nextDouble() {
            double cur = nextLong();
            return c!='.' ? cur:cur+nextLong()/cnt;
        }

        public String next() {
            StringBuilder res = new StringBuilder();
            while(c<=32)c=getChar();
            while(c>32) {
                res.append(c);
                c=getChar();
            }
            return res.toString();
        }

        public String nextLine() {
            StringBuilder res = new StringBuilder();
            while(c<=32)c=getChar();
            while(c!='\n') {
                res.append(c);
                c=getChar();
            }
            return res.toString();
        }

        public boolean hasNext() {
            if(c>32)return true;
            while(true) {
                c=getChar();
                if(c==NC)return false;
                else if(c>32)return true;
            }
        }
    }
}