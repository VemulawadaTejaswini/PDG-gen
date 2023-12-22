

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean uses[];
    static int[] r;
    static int[][] distances;

    static int dfs(int s, int depth) {
        int minval = Integer.MAX_VALUE;
        if (depth == 1) return 0;
        for (int i = 0; i < r.length; i++) {
            if (!uses[i] && distances[s][r[i]-1] != Integer.MAX_VALUE) {
                uses[i] = true;
                minval = Math.min(minval, distances[s][r[i]-1] + dfs(r[i]-1, depth - 1));
                uses[i] = false;
            }
        }
        return minval;
    }

    public static void main(String[] args) throws Exception {
        int[] NMR = inputval();
        int N, M, R;
        N = NMR[0];
        M = NMR[1];
        R = NMR[2];
        r = inputval();
        uses = new boolean[r.length];
        int[][] ABC = new int[M][3];
        for (int i = 0; i < M; i++) {
            ABC[i] = inputval();
        }
        distances = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) distances[i][j] = 0;
                else distances[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < M; i++) {
            distances[ABC[i][0] - 1][ABC[i][1] - 1] = Math.min(distances[ABC[i][0] - 1][ABC[i][1] - 1], ABC[i][2]);
            distances[ABC[i][1] - 1][ABC[i][0] - 1] = distances[ABC[i][0] - 1][ABC[i][1] - 1];
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    distances[i][j] = Math.min(distances[i][k] + distances[k][j], distances[i][j]);
                }
            }
        }
        for (int i = 0; i < uses.length; i++) {
            uses[i] = false;
        }
        int d = Integer.MAX_VALUE;
        for (int i = 0; i < r.length; i++) {
            uses[i] = true;
            d = Math.min(d, dfs(r[i]-1, r.length));
            uses[i] = false;
        }
        System.out.println(d);
    }


    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    static void array_sout(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void array_sout(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}