import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static long[][]memo;static char[][]g;
    static long dp(int id1, int id2) {
        if (id1 == n||id2==m||g[id1][id2]=='#') return 0;
        if (id1==n-1&&id2==m-1)return 1;
        if (memo[id1][id2] != -1) {
            return memo[id1][id2];
        }
        return memo[id1][id2]=(dp(id1+1,id2)+dp(id1,id2+1))%1000000007;
    }
    public  static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n= sc.nextInt();
        m = sc.nextInt();
        memo= new long[n][m];
        g= new char[n][m];
        for (long[]x:memo){
            Arrays.fill(x,-1);
        }
        for (int i =0;i<n;i++){
            g[i]=sc.nextLine().toCharArray();
        }
        pw.println(dp(0,0)%1000000007);
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