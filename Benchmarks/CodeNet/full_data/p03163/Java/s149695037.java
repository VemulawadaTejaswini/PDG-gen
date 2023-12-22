import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static SScanner scan= new SScanner(System.in);
    static int [] n;
    static int [] w;
    static StringBuilder sb;
    static long dp[][];

    public static void main(String [] args) throws IOException {
        int N= scan.nextInt();
        int W= scan.nextInt();

        n= new int[N];
        w= new int[N];

        for(int i= 0; i< N; i++){
            w[i]= scan.nextInt();
            n[i]= scan.nextInt();
        }

        /*sb= new StringBuilder();
        trace(0, W);

        System.out.println(sb);*/

        dp= new long[N][W + 1];
        for (long[] longs : dp) Arrays.fill(longs, -1);

        System.out.println(dp(0, W));
        //System.out.println(buttomUpdp(0, W));

    }


    private static long buttomUpdp(int idx, int remw) {

        long [] tableVal= new long[remw + 1];
        //tableVal[0] = 0;
        for(int i= n.length - 1; i >= 0; i--){
            for(int j= remw ; j >= 0; j--){
                long leave = tableVal[j];
                long take= (j - w[i] < 0) ? Long.MIN_VALUE : n[i] + tableVal[j - w[i]];

                tableVal[j]= Math.max(leave, take);
            }
        }

        return tableVal[tableVal.length - 1];
    }

    private static long dp(int i, int remw) {
        if(remw < 0)
            return Long.MIN_VALUE;

        if(i == n.length || remw == 0)
            return 0;

        if(dp[i][remw] != -1)
            return dp[i][remw];

        long take= (long)n[i] + dp(i + 1, remw - w[i]);
        long leave= dp(i + 1, remw);

        return dp[i][remw] = Math.max(take, leave);
    }

    static void trace(int idx, int rWeight){
        if(idx == n.length)
            return;

        if(dp(idx, rWeight) !=  dp(idx + 1, rWeight)) {
            sb.append(idx).append(" ").append(rWeight).append("\n");
            trace(idx + 1, rWeight - w[idx]);
        }
        else
            trace(idx + 1, rWeight);
    }

}




class SScanner
{
    StringTokenizer st;
    BufferedReader br;

    public SScanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

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
