
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int n,weight,w[],v[];
    static long memo[][];
    static final int inf=(int)1e9;
    public static void main(String[] args) throws Exception {
        //============================================//
        //answer here:
        n=scanner.nextInt(); weight=scanner.nextInt();
        w=new int[n];
        v=new int[n];
        memo=new long[2][weight+1];
        for (int i = 0; i <n ; i++) {
            w[i]=scanner.nextInt();
            v[i]=scanner.nextInt();
        }
//        for (long[] arr:memo){
//            Arrays.fill(arr,-1);
//        }
        //long ans=dp(0,weight);
        //bottom-top approach: (flood-fill)
        //using 2d array more efficient space.
        for (int i=n-1; i>=0; i--){
            int cur=i%2;
            for (int remw=weight; remw>=0; remw--){
                if(remw-w[i]>=0) memo[cur][remw]=Math.max(v[i]+memo[1-cur][remw-w[i]],memo[1-cur][remw]);  //max of take and leave
                else memo[cur][remw]=memo[1-cur][remw];   //leave;
            }
        }
        out.println(memo[0][weight]);
        //============================================//
        out.close();
    }
    //top down approach
    public static long dp(int i, int remw){
        if (remw<0) return -inf;
        if (i==n) return 0;
        if (memo[i][remw]!=-1) return memo[i][remw];
        long take=v[i]+dp(i+1,remw-w[i]);
        long leave=dp(i+1,remw);
        return memo[i][remw]=Math.max(take,leave);
    }
}
class Scanner {
    StringTokenizer st;
    BufferedReader br;

    public Scanner(InputStream system) {
        br = new BufferedReader(new InputStreamReader(system));
    }

    public Scanner(String file) throws Exception {
        br = new BufferedReader(new FileReader(file));
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public char nextChar() throws IOException {
        return next().charAt(0);
    }

    public Long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public boolean ready() throws IOException {
        return br.ready();
    }

    public void waitForInput() throws InterruptedException {
        Thread.sleep(3000);
    }

    int[] readArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    long[] readLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }
}

class pair implements Comparable<pair> {
    int u;
    int v;

    public pair(int u, int v) {
        this.u= u;
        this.v = v;
    }

    @Override
    public String toString() {
        return v+""+u;
    }

    @Override
    public int compareTo(pair o) {
        return o.v-v;
    }
}
