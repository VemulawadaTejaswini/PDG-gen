import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main{
    static int w;
    static  int n;
    static int[] we;
    static long val[];
    static long[][] memo;
    public static void main(String[] args) throws IOException {
        scanner sc = new scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = sc.nextInt();
        w = sc.nextInt();

        we = new int[n];
        val = new long[n];
        memo = new long[n][w+1];

        for (int i = 0; i < n; i++)
            Arrays.fill(memo[i],-1);

        for (int i = 0; i < n; i++) {
            we[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }

        out.println(dp(0,w));
        out.flush();
    }

    static long dp(int i,int w){
        if (i == n || w == 0)
            return 0;

        if (memo[i][w] != -1)
            return memo[i][w];

        long take = 0;

        if (w-we[i] >= 0)
            take = dp(i+1,w-we[i]) + val[i];

        long leave = dp(i+1,w);

        return memo[i][w] = Math.max(take,leave);
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

    public boolean ready() throws IOException {
        return br.ready();
    }
}