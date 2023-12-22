import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main{
    static int n;
    static double[] prob;
    static double[][] memo;
    public static void main(String[] args) throws IOException {
        scanner sc = new scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = sc.nextInt();

        prob = new double[n];
        for (int i = 0; i < n; i++)
            prob[i] = (float) sc.nextDouble();

        memo = new double[n][n+1];

        for (int i = 0; i < n; i++)
            Arrays.fill(memo[i],-1);





         out.println(dp(0,0));
        out.flush();

    }

    static double dp(int i,int tails){
        if (i == n)
            return tails > n/2?1:0;

        if (memo[i][tails] != -1) return memo[i][tails];

        return memo[i][tails] = prob[i]*dp(i+1,tails+1) + (1-prob[i])*dp(i+1,tails);
    }

}
class scanner{
    StringTokenizer st;
    BufferedReader br;
    public scanner(InputStream s){
        br = new BufferedReader(new InputStreamReader(s));
    }
    public scanner (String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(s));}

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return  Long.parseLong(next());
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public boolean ready() throws IOException {
        return br.ready();
    }
}