import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int INF = 0x3f3f3f3f;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;
    public static int MOD = 1000000007;

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        long total = 0;
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < N-1; i++){
            total += Math.min(A[i+1] - A[i], T);
        }
        total += T;
        pw.print(total + "\n");
        
        pw.close(); 
        br.close();
    }
}

class Point {
    public int r, c;

    Point(int r, int c){
        this.r = r;
        this.c = c;
    }

    // public int compareTo(Point p){
    //     if(x != p.x) return x < p.x ? -1 : 1;
    //     else if(y != p.y) return y < p.y ? -1 : 1;
    //     return 0;
    // }
}