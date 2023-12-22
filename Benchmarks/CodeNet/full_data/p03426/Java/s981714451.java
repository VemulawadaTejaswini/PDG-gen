import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int[][] A = new int[H][W];
        int[][] inv_A = new int[H*W+1][2];
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                A[i][j] = Integer.parseInt(sc.next());
                inv_A[A[i][j]][0] = i;
                inv_A[A[i][j]][1] = j;
            }
        }
        long[][] dp = new long[D][H*W/D+1];
        for (int i=0;i<D;i++) {
            for (int j=0;j<H*W/D;j++) {
                if ((D*(j+1)+i)<H*W) {
                    dp[i][j+1] = dp[i][j] + Math.abs(inv_A[D*(j+1)+i][0]-inv_A[D*j+i][0]) + Math.abs(inv_A[D*(j+1)+i][1]-inv_A[D*j+i][1]);
                }
            }
        }

        int Q = Integer.parseInt(sc.next());
        for (int i=0;i<Q;i++) {
            int L = Integer.parseInt(sc.next());
            int R = Integer.parseInt(sc.next());
            System.out.println(dp[R%D][R/D]-dp[L%D][L/D]);
        }
    }
}