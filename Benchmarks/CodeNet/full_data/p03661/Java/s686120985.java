import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Pair>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int INF = 0x3f3f3f3f;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;
    public static int MOD = 1000000007;

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        long total = 0;
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
            total += A[i];
        }
        long ans = LINF;
        long a = 0;
        for(int i = 0; i < N - 1; i++){
            a += A[i];
            long b = total - a;
            ans = Math.min(ans, Math.abs(a - b));
        }

        pw.print(ans + "\n");



        pw.close(); 
        br.close();
    }
}

class Pair {
    public int a;
    public long b;

    Pair(int a, long b){
        this.a = a;
        this.b = b;
    }

}