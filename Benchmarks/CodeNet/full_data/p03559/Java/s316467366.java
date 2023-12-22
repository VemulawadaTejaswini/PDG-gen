import java.io.*;
import java.util.*;
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
    public static int MOD = 1000000007;

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());
        int[][] A = new int[3][N];

        for(int j = 0; j < 3; j++){
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++){
                A[j][i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(A[j]);
        }

        long[] B = new long[N];
        for(int i = 0; i < N; i++){
            int a = -1;
            int b = N-1;
            while(a != b){
                int mid = (a + b + 1) / 2;
                if(A[0][mid] < A[1][i]){
                    a = mid;
                } else{
                    b = mid - 1;
                }
            }
            B[i] = (a + 1);
        }

        for(int i = 1; i < N; i++){
            B[i] += B[i-1];
        }

        long total = 0;

        for(int i = 0; i < N; i++){
            int a = -1;
            int b = N-1;
            while(a != b){
                int mid = (a + b + 1) / 2;
                if(A[1][mid] < A[2][i]){
                    a = mid;
                } else{
                    b = mid - 1;
                }
            }
            if(a >= 0) total += B[a];
        }

        pw.print(total + "\n");


        pw.close(); 
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public int x, y;

    Pair(int _x, int _y){
        x = _x;
        y = _y;
    }

    public String toString(){
        return x + "," + y;
    }

    public int compareTo(Pair p){
        if(x != p.x) return x < p.x ? 1 : -1;
        else if(y != p.y) return y < p.y ? -1 : 1;
        return 0;
    }
}