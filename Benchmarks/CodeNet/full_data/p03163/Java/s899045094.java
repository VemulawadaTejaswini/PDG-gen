import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class C {
    static int n;
    static int[]v,w;
    static long[][]memo;
    static long dp(int id,int W) {
        if (id == n) return 0;
        if (memo[id][W] != -1) {
            return memo[id][W];
        }
        long take = 0l;
        if (w[id] <= W){
             take = v[id]*1l+dp(id+1,W-w[id]);
    }
        return memo[id][W]=Math.max(dp(id+1,W),take);
    }
    public  static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n= sc.nextInt();
        int remw = sc.nextInt();
        v= new int[n];
        w= new int[n];
        memo= new long[n][remw+1];
        for (long[]x:memo){
            Arrays.fill(x,-1);
        }
        for (int i =0;i<n;i++){
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }
        pw.println(dp(0,remw));
       // pw.println(Arrays.deepToString(memo));

      pw.flush();
    }
    static class Scanner
    {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException
        {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if(x.charAt(0) == '-')
            {
                neg = true;
                start++;
            }
            for(int i = start; i < x.length(); i++)
                if(x.charAt(i) == '.')
                {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                }
                else
                {
                    sb.append(x.charAt(i));
                    if(dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg?-1:1);
        }

        public boolean ready() throws IOException {return br.ready();}


    }
}