import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    // static {
    //     try {
    //         System.setOut(new PrintStream(new File("output.txt")));
    //         new File("input.txt").createNewFile();
    //         System.setIn(new FileInputStream(new File("input.txt")));
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }
    static FastReader fastReader = new FastReader();
    static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) throws Exception {
        try {
            // int testCases = fastReader.nextInt();
            int testCases=1;
            while (testCases-- > 0) {
                int n=fastReader.nextInt();
                int a[]=new int[n];
                int b[]=new int[n];
                int c[]=new int[n];
                for(int i=0;i<n;i++){
                    a[i]=fastReader.nextInt();
                    b[i]=fastReader.nextInt();
                    c[i]=fastReader.nextInt();
                }
                int dp[][]=new int[n][3];
                dp[0][0]=a[0];
                dp[0][1]=b[0];
                dp[0][2]=c[0];
                for(int i=1;i<n;i++){
                    dp[i][0]=a[i]+Math.max(dp[i-1][1], dp[i-1][2]);
                    dp[i][2]=b[i]+Math.max(dp[i-1][0], dp[i-1][1]);
                    dp[i][1]=c[i]+Math.max(dp[i-1][0], dp[i-1][2]);
                }
                System.out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
                
            }
            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.flush();
        } catch (Exception e) {
            return;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}