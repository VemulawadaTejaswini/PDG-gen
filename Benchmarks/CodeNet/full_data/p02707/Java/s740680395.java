import java.util.*; 
import java.io.*;

public class Main{
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = nextInt();
        
        int[] postion = new int[N+1];
        int[] cnt = new int[N+1];
 
        for (int i=2; i<=N; i++) {
            postion[i] = nextInt();
        }

        // Every member has exactly one immediate boss with a smaller ID number.
        for (int i=N; i>=1; i--) {
            cnt[postion[i]] ++;
        }

        for (int i=1; i<=N; i++) {
            System.out.println(cnt[i]);
        }

        
    }

    public static int gcd(int a, int b) {
        if(b==0) return a;

        return gcd(b, a%b);
    }
      
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}