import org.omg.CORBA.Environment;

import java.util.Scanner;

public class Main {
    private static int cost(int N, int[][] D, int[][]c, int []cX) {
        int ans = 0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                int cFrom = c[i][j];
                int cTo = cX[(i+j)%3];
                if (cTo < 1) { cTo = cFrom; }
                //System.out.println(" " + cFrom + "->" + cTo + " = " + D[cFrom][cTo]);
                ans += D[cFrom][cTo];
            }
        }
        //System.out.println("\n");
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int [][]D = new int[C+1][C+1];
        int [][]c = new int[N][N];

        for (int i=1; i<=C; i++) {
            for (int j=1; j<=C; j++) {
                D[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                c[i][j] = sc.nextInt();
            }
        }

        int ans = Integer.MAX_VALUE;

        // cX[X] means color for (i+j)%X
        int []cX = new int[3];
        for (cX[0]=1; cX[0]<=C; cX[0]++) {
            for (cX[1]=1; cX[1]<=C; cX[1]++) {
                if (cX[0] == cX[1]) {
                    continue;
                }
                cX[2] = 0;
                if (ans < cost(N, D, c, cX)) {
                    continue;
                }
                for (cX[2]=1; cX[2]<=C; cX[2]++) {
                    if (cX[0] == cX[2] || cX[1] == cX[2]) {
                        continue;
                    }
                    ans = Integer.min(ans, cost(N, D, c, cX));
                }
            }
        }

        System.out.println("" + ans);
    }
}
