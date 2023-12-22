
import java.util.*;
import java.io.*;

public class Main {
    static int[][]memo,inv[];
    static int[][]a;
    static int dp(int i,int j){
        if (i+j==a.length)
            return 0;
        if (memo[i][j]!=-1)
            return memo[i][j];
        int ans=(int)1e9;
        if (i<a.length/2){
            ans=Math.min(ans,inv[0][i+1][j]+dp(i+1,j));
        }
        if (j<a.length/2){
            ans=Math.min(ans,inv[1][j+1][i]+dp(i,j+1));
        }
        return memo[i][j]=ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n= sc.nextInt();
        a= new int[2*n][2];
        for (int i =0;i<2*n;i++){
            int t = sc.next().charAt(0)=='W'?0:1;
            a[i][0]=sc.nextInt();
            a[i][1]=t;
        }
        inv= new int[2][n+1][n+1];

        FenwickTree[] fn = new FenwickTree[2];
        fn[0]= new FenwickTree(n+1);
        fn[1]=new FenwickTree(n+1);
        for (int i =0;i<2*n;i++){
            int c=a[i][1];
            int v = a[i][0];
            for (int j=0;j<=n;j++){
                inv[c][v][j]=fn[c].rsq(v+1,n+1)+fn[1^c].rsq(j+1,n+1);
            }
            fn[c].point_update(v,1);
        }
        memo= new int[n+1][n+1];
        for (int[]x:memo)Arrays.fill(x,-1);
        pw.println(dp(0,0));
        pw.flush();
    }
    static class FenwickTree { // one-based DS

        int n;
        int[] ft;

        FenwickTree(int size) { n = size; ft = new int[n+1]; }

        int rsq(int b) //O(log n)
        {
            int sum = 0;
            while(b > 0) { sum += ft[b]; b -= b & -b;}		//min?
            return sum;
        }

        int rsq(int a, int b) { return rsq(b) - rsq(a-1); }

        void point_update(int k, int val)	//O(log n), update = increment
        {
            while(k <= n) { ft[k] += val; k += k & -k; }		//min?
        }
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = nextInt();
            return arr;
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}