import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;

    static int h, w;
    static int[][] C = new int[10][10];
    static int[][] A;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        h = in.nextInt();
        w = in.nextInt();
        A = new int[h][w];

        for(int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++) C[i][j] = in.nextInt();

        for(int i = 0; i < h; i++)
            for (int j = 0; j < w; j++) A[i][j] = in.nextInt();

        long dist[][] = new long[10][10];
        for(int i = 0; i < 10; i++) {
            Arrays.fill(dist[i], inf);
            for (int j = 0; j < 10; j++) dist[i][j] = C[i][j];
        }

        for(int k = 0; k < 10; k++) {
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 10; j++) {
                    if(i == j) continue;
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        long cost = 0;
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(A[i][j] == -1) continue;
                cost += dist[A[i][j]][1];
            }
        }

        print(cost);
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(long i) {
        System.out.println(i);
    }

    static void print(float i) {
        System.out.println(i);
    }
}