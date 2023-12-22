import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main{
    static String s;
    static String t;
    static int n;
    static int m;
    static int[][] memo;
    public static void main(String[] args) throws IOException {
        scanner sc = new scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        s = sc.next();
        t = sc.next();
        n = s.length();
        m = t.length();

        memo = new int[n+1][m+1];

        for (int i = 0; i < n; i++)
           Arrays.fill(memo[i],-1);
        dp(0,0);
        Stack<Character> a = new Stack<>();
        int i;
        int j;
        for (i = n,j = m ; i > 0 && j > 0;) {
            if (s.charAt(i-1) == t.charAt(j-1)){
                a.push(s.charAt(i-1));
                i--;j--;continue;
            }
            else if (memo[i-1][j] > memo[i][j-1])
                i--;
            else
                j--;


        }
        while (!a.isEmpty()) out.print(a.pop());
        out.println();
        
        out.flush();

    }

    static int dp(int i,int j){
        if (i == n || j == m)
            return 0;

        if (memo[i][j] != -1)
            return  memo[i][j];
        int one = 0;
        if (s.charAt(i) == t.charAt(j))
            one = dp(i+1,j+1) + 1;
        else {
            one = Math.max(dp(i+1,j),dp(i,j+1));
        }
        return memo[i][j] = one;
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