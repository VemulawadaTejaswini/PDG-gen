import java.io.*;
import java.util.*;
import java.math.*;
 
class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st, st2;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1, 0};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1, 0};
    public static int INF = 0x3f3f3f3f;
    public static int MOD = 1000000007;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;

    private static boolean canDo(int i, int[] A, int M, int V, int P) {
        if (A.length - i <= P) {
            return true;
        }

        V -= Math.min(V, P);
        long max = A[i] + M;
        long left = (long)V * M;


        for (int j = 0; j < A.length - P; j++) {
            if (i == j) continue;
            if (A[j] > max) return false;
            left -= Math.min(M, max - A[j]);
        }
        return left <= 0;
    }

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        // System.out.println(canDo(3, A, M, V, P));

        int a = 0;
        int b = N-1;
        while (a != b) {
            int mid = (a + b) / 2;
            // System.out.println(mid);
            if (canDo(mid, A, M, V, P)) {
                b = mid;
            } else {
                a = mid + 1;
            }
        }
        // System.out.println(a);
            // i
        pw.println(N - a);

        pw.close();
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public int a, b;

    Pair(int _a, int _b){
        a = _a;
        b = _b;
    }
 
    public String toString(){
        return a + " " + b;
    }

    public int compareTo(Pair p){
        if (b != p.b) return b < p.b ? -1 : 1;
        if (a != p.a) return a < p.a ? -1 : 1;
        return 0;
    }
}