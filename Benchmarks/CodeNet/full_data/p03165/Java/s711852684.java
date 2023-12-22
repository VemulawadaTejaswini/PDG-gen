import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder ans;
    static int[][] dp;

    public static void solve(InputReader in, PrintWriter out) throws Exception {

        String s = in.nextLine();
        String t = in.nextLine();
        ans= new StringBuilder("");
        dp = new int[s.length()][t.length()];

        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
            dp[i][j]=-1;

        StringBuilder a = new StringBuilder();
       get_LCS(s,t,s.length()-1,t.length()-1,a);

//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                System.out.print(dp[i][j] + " ");
//            }
//
//            System.out.println();
//        }
//

        int i = s.length()-1;
        int j = t.length()-1;

        while(i>=0 && j>=0)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                ans.insert(0,s.charAt(i));

                i--;
                j--;
            }

            else if(i>=1 && j>=1 && dp[i-1][j]>dp[i][j-1])
            {
                i--;
            }

            else
                j--;

        }

            out.println(ans);
    }

    public static int get_LCS(String s, String t,int i, int j, StringBuilder a)
    {

        if(i<0 || j<0) {
            return 0;
        }

        char c1 = s.charAt(i);
        char c2 = t.charAt(j);

        if(dp[i][j]!=-1)
            return dp[i][j];

        int len = 0;

        if(c1==c2)
        {
            len++;
            len+= get_LCS(s,t,i-1,j-1,a);
            dp[i][j]=len;
        }

        else
        {
            len+= Math.max(get_LCS(s,t,i-1,j,a),get_LCS(s,t,i,j-1,a));
            dp[i][j]=len;
        }

        return dp[i][j];
    }



    /////////////////////////////////////////////////////////


    private final static long hash(long x, long y) {
        x += offset;
        y += offset;
        return x << 32 | y;
    }

    private final static int offset = (int) 3e5;

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solve(in, out);
        out.close();
    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        private String nextToken() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
            return tokenizer.nextToken();
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(nextToken());
        }

    }
}
