
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int[][] D = new int[C+1][C+1];
        for (int i=1; i<=C; i++) {
            for (int j=1; j<=C; j++) {
                D[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[N+1][N+1];
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(N, C, c, D));
    }

    private static int solve(int N, int C, int[][] c, int[][] D) {
        int[][] typeCount = new int[3][C+1];
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                typeCount[(i+j)%3][c[i][j]]++;
            }
        }

        int minDiff = Integer.MAX_VALUE;
        for (int x=1; x<=C; x++) {
            for (int y=1; y<=C; y++) {
                if (x == y) continue;
                for (int z=1; z<=C; z++) {
                    if (y == z || z == x) continue;
                    int tmp = Math.min(minDiff, calcDiff(C, typeCount, new int[]{x, y, z}, D));
                    minDiff = Math.min(minDiff, tmp);
                }
            }
        }

        return minDiff;
    }

    private static int calcDiff(int C, int[][] typeCount, int[]  xyz, int[][] D) {
        int diff = 0;

        for (int i=0; i<3; i++) {
            for (int c=1; c<=C; c++) {
//                System.err.println("from=" + xyz[i] + " to=" + c + " for count=" + typeCount[i][c] + " with cost=" + D[c][xyz[i]]);
                diff += typeCount[i][c] * D[c][xyz[i]];
            }
        }

        return diff;
    }
}
