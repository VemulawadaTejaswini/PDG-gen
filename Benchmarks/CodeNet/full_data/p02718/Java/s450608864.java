import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int N = nextInt();
        int M = nextInt();

        int[] input = new int[N];

        int total = 0;
        for (int x=0; x<N; x++) {
            input[x] = nextInt();
            total += input[x];
        }
        
        Arrays.sort(input);

        // read top M
        for (int x=N-1; x>N-1-M; x--) {
            if( input[x] * 4 * M < total){
                System.out.println("No");
                return;
            };
        }

        System.out.println("Yes");

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