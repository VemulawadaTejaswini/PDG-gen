import java.util.*;
import java.io.*;
public class Main{
    static int N, a, b, c;
    static boolean done[][][];
    static double dp[][][];
    static double f(int a, int b, int c){
        if (a==0&&b==0&&c==0) return 0.0;
        if (done[a][b][c]) return dp[a][b][c];
        done[a][b][c] = true;
        dp[a][b][c] = 1.0;
        if (a!=0) dp[a][b][c] += (double)a/(double)(N) * f(a-1, b, c);
        if (b!=0) dp[a][b][c] += (double)b/(double)(N) * f(a+1, b-1, c);
        if (c!=0) dp[a][b][c] += (double)c/(double)(N) * f(a, b+1, c-1);
        dp[a][b][c] /= (1.0 - ((double)(N-a-b-c)/(double)(N)));
        //System.out.println(a + " " + b + " " + c + " "+ dp[a][b][c]);
        return dp[a][b][c];
    }
    public static void main(String[] args) throws IOException{
        N = readInt();
        for (int i = 1; i<=N; i++){
            int x = readInt();
            if (x==1) a++;
            if (x==2) b++;
            if (x==3) c++;
        }
        dp = new double[N+1][N+1][N+1];
        done = new boolean[N+1][N+1][N+1];
        System.out.println(f(a, b, c));
        
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
    }
    static long readLong() throws IOException {
            return Long.parseLong(next());
    }

    static float readFloat() throws IOException {
            return Float.parseFloat(next());
    }

    static boolean readBool() throws IOException {
            return Boolean.parseBoolean(next());
    }

    static short readShort() throws IOException {
            return Short.parseShort(next());
    }

    static byte readByte() throws IOException {
            return Byte.parseByte(next());
    }

    static int readInt() throws IOException {
            return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
            return Double.parseDouble(next());
    }

    static char readChar() throws IOException {
            return next().charAt(0);
    }

    static String readLine() throws IOException {
            return br.readLine().trim();
    }

    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    static void print(Object o) {
            pr.print(o);
    }
}