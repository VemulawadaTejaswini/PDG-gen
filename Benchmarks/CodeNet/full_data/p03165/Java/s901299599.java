import java.util.*;
import java.io.*;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////                                                                                            /////////
////////                                                                                            /////////
////////   MMMM          MMMM    AAAAAAAAAAAAAAAAA  RRRRRRRRRR       EEEEEEEEEEEEE  DDDDDDDDD       /////////
////////   MMMMMM      MMMMMM    AAAAAAAAAAAAAAAAA  RRRR     RRR     EEEEEEEEEEEEE  DDD     DDD     /////////
////////   MMMM MMM  MMM MMMM    AAAA         AAAA  RRRR      RRR    EEEEE          DDD      DDD    /////////
////////   MMMM  MMMMM   MMMM    AAAA         AAAA  RRRR       RRR   EEEEE          DDD       DDD   /////////
////////   MMMM          MMMM    AAAA         AAAA  RRRR      RRR    EEEEE          DDD        DDD  /////////
////////   MMMM          MMMM    AAAA         AAAA  RRRR     RRR     EEEEEEEEEEE    DDD         DDD /////////
////////   MMMM          MMMM    AAAAAAAAAAAAAAAAA  RRRRRRRRRR       EEEEEEEEEEE    DDD         DDD /////////
////////   MMMM          MMMM    AAAAAAAAAAAAAAAAA  RRRR    RRR      EEEEE          DDD        DDD  /////////
////////   MMMM          MMMM    AAAA         AAAA  RRRR     RRR     EEEEE          DDD      DDD    /////////
////////   MMMM          MMMM    AAAA         AAAA  RRRR      RRR    EEEEEEEEEEEEE  DDD    DDD      /////////
////////   MMMM          MMMM    AAAA         AAAA  RRRR       RRR   EEEEEEEEEEEEE  DDDDDDDDD       /////////
////////                                                                                            /////////
////////                                                                                            /////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {
    static int[][] memo;
    static String s,t;
    static int dp(int i, int j){
        if(i==s.length() || j==t.length()){return 0;}
        int z = -1;
        if(s.charAt(i)==t.charAt(j)){z = 1 + dp(i+1, j+1);}
        int x = dp(i+1, j);
        int y = dp(i, j+1);
        return memo[i][j] = Math.max(x,Math.max(y,z));
    }
    static void dp2(int i, int j){
        if(i==s.length() || j==t.length()){return;}
        int z = dp(i+1, j+1)+1;
        int x = dp(i+1, j);
        int y = dp(i, j+1);
        if(memo[i][j]==z){System.out.print(s.charAt(i)); dp2(i+1, j+1); return;}
        if(memo[i][j]==x){dp2(i+1, j); return;}
        if(memo[i][j]==y){dp2(i, j+1); return;}

    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        s = sc.nextLine(); t = sc.nextLine();
        memo = new int[s.length()][t.length()];

        int answer = dp(0, 0);

        dp2(0,0);
        //out.println(answer);


        out.flush();

    }

    static class Scanner {
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
    }
}