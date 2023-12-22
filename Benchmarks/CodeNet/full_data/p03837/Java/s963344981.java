import org.omg.CORBA.MARSHAL;
import sun.reflect.generics.tree.Tree;

import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

public class Main implements Runnable {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception {
        new Thread(null, new Main(), "Main", 1 << 26).start();
    }

     long modPow(long a, long p, long m) {
        if (a == 1) return 1;
        long ans = 1;
        while (p > 0) {
            if (p % 2 == 1) ans = (ans * a) % m;
            a = (a * a) % m;
            p >>= 1;
        }
        return ans;
    }

     long modInv(long a, long m) {
        return modPow(a, m - 2, m);
    }


    long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }


    PrintWriter out;
    InputReader sc;

    public void run() {
        sc = new InputReader(System.in);
        // Scanner sc=new Scanner(System.in);
        //  Random sc=new Random();
        out = new PrintWriter(System.out);

        n=sc.nextInt();
        m=sc.nextInt();
        l=new ArrayList[n];
        for (int i = 0; i <n ; i++) {
            l[i]=new ArrayList<>();
        }

        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i <m ; i++) {
            int u=sc.nextInt()-1;
            int v=sc.nextInt()-1;
            int w=sc.nextInt();
            int min=Math.min(u,v);
            int max=Math.max(u,v);
            hm.put((min<<8)|max,0);
            Node t1=new Node(v,w);
            Node t2=new Node(u,w);
            l[u].add(t1);
            l[v].add(t2);
        }

//        for (int i = 0; i <n ; i++) {
//            out.println(l[i]);
//        }

        ArrayList<Integer> paths[][]=new ArrayList[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                //out.println("--------------"+i+" "+j);
                paths[i][j]=shortestPath(i,j);
                //out.println(i+" "+j+" "+paths[i][j]);
                for (int k = 0; k <paths[i][j].size()-1 ; k++) {
                    int min=Math.min(paths[i][j].get(k),paths[i][j].get(k+1));
                    int max=Math.max(paths[i][j].get(k),paths[i][j].get(k+1));
                    hm.put((min<<8)|max,1);
                }
            }
        }

        int ans=0;
       for(int key: hm.keySet()){
            if(hm.get(key)==0){
                ans++;
            }
       }

       out.println(ans);





        out.close();
    }

    int n,m;
    ArrayList<Node> l[];

    ArrayList<Integer> shortestPath(int source,int destination){
        PriorityQueue<Node> pq=new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.compare(o1.w,o2.w);
            }
        });
        int path[]=new int[n];
        int dp[]=new int[n];
        for (int i = 0; i < n; i++) {
            path[i]=-1;
            dp[i]=Integer.MAX_VALUE/2;
        }
        dp[source]=0;
        pq.add(new Node(source,0));
        while (!pq.isEmpty()){
            Node u=pq.remove();

            for(Node v:l[u.vertex]){
                if(dp[v.vertex]>dp[u.vertex]+u.w){
                    //out.println("yes "+u.vertex+" "+v.vertex+" "+(dp[u.vertex]+u.w)+" "+u.w+" "+dp[v.vertex]);
                    pq.add(new Node(v.vertex,dp[u.vertex]+v.w));
                    dp[v.vertex]=dp[u.vertex]+v.w;
                    path[v.vertex]=u.vertex;
                }
            }
        }
      //  out.println(Arrays.toString(dp));
        ArrayList<Integer> path_S_D=new ArrayList<>();
        int d=destination;
        while (path[destination]!=-1){
            path_S_D.add(destination);
            destination=path[destination];
        }
        if(source!=d)path_S_D.add(source);
        return path_S_D;
    }

    class Node{
        public Node(int vertex, int w) {
            this.vertex = vertex;
            this.w = w;
        }

        int vertex,w,consume;

        @Override
        public String toString() {
            return "Node{" +
                    "vertex=" + vertex +
                    ", w=" + w +
                    '}';
        }
    }

}