import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main{
    static int[][] grid;
    static int[][] memo;
    static int r;
    static int c;
    static int mod = (int) (1e9 + 7);
    public static void main(String[] args) throws IOException {
        scanner sc = new scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        r = sc.nextInt();
        c = sc.nextInt();

        grid = new int[r][c];

        for (int i = 0; i < r; i++) {
            String s = sc.next();
            for (int j = 0; j < c; j++) {
                if (s.charAt(j) == '.')
                    grid[i][j] = 0;
                else grid[i][j] = 1;
            }
        }

        memo = new int[r][c];
        for (int i = 0; i < r; i++)
            Arrays.fill(memo[i],-1);

        out.println(dp(0,0));
        out.flush();

    }

    static int dp(int i,int j){

        if (i == r-1 && j == c-1)
            return 1;

        if (memo[i][j] != -1) return  memo[i][j];

        int right = 0;
        int down = 0;

        if (valid(i+1,j))
            down = dp(i+1,j);

        if (valid(i,j+1))
            right = dp(i,j+1);

        return memo[i][j] = (right+down)%mod;

    }
    static boolean valid(int x,int y){
        if (x >= r || y >= c || grid[x][y] == 1)
            return false;
        return true;
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