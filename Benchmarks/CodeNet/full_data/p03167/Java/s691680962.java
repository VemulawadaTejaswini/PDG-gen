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
    static char[][] arr;
    static long[][] memo;
    static int h,w;
    static long dp(int i, int j){
        if(i==h-1 && j==w-1){return 1;}
        if(memo[i][j]!=-1){return memo[i][j];}
        long x = 0; long y = 0;
        if(valid(i+1, j)){x = dp(i+1, j);}
        if(valid(i, j+1)){y = dp(i, j+1);}
        return memo[i][j] = (long)(x%(1e9 + 7) + y%(1e9 + 7));
    }
    static boolean valid(int i, int j){
        return i!=h && j!=w && arr[i][j]!='#';
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        h = sc.nextInt(); w = sc.nextInt();
        arr = new char[h][w];
        for(int i = 0; i<h ;i++){
            String s = sc.nextLine();
            for(int j = 0; j<w; j++){
                arr[i][j] = s.charAt(j);
            }
        }
        memo = new long[h][w];
        for(int i = 0 ; i<h; i++){
            Arrays.fill(memo[i], -1);
        }
        long answer = dp(0,0);
        out.println((int)(answer%(1e9 + 7)));
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