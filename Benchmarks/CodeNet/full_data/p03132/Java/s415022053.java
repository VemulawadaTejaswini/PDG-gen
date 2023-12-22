import java.io.*;
import java.util.*;
import java.math.*;
 
class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1, 0};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1, 0};
    public static int INF = 0x3f3f3f3f;
    public static int MOD = 1000000007;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;

    public static long[][] memo;
    public static int L;
    public static int[] A;

    public static long solve(int index, int stage) {
        if (index == L){
            return 0;
        }
        if (memo[index][stage] != -1) {
            return memo[index][stage];
        }

        long ans = LINF;
        for (int i = stage; i < 5; i++) {
            long cost = 0;
            if (i == 0 || i == 4) {
                cost = A[index];
            } else if (i == 1 || i == 3) {
                if (A[index] == 0) {
                    cost = 2;
                } else {
                    cost = A[index] % 2;
                }
            } else {
                cost = (A[index] + 1) % 2;
            }
            ans = Math.min(ans, cost + solve(index+1, i));
        }

        return memo[index][stage] = ans;
    }

    public static void main(String[] args) throws Exception {
        L = Integer.parseInt(br.readLine());
        A = new int[L];
        for (int i = 0; i < L; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        memo = new long[L][5];
        for (int i = 0; i < L; i++) {
            Arrays.fill(memo[i], -1);
        }

        pw.println(solve(0, 0));

        pw.close(); 
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public long x;
    public int y;
 
    Pair(long _x, int _y){
        x = _x;
        y = _y;
    }
 
    public String toString(){
        return x + " " + y;
    }

    public int compareTo(Pair p){
        if (x != p.x) return x < p.x ? -1 : 1;
        if (y != p.y) return y < p.y ? -1 : 1;
        return 0;
    }
} 