import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        final int C = Integer.parseInt(sc.next());
        int ans = 0;
        int[] b = new int[M];
        int[][] a = new int[N][M];
        for (int i = 0; i < M; i++) {
            b[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i=0; i<N; i++) {
            long sum = 0;
            for (int j=0; j<M; j++) {
                sum += a[i][j] * b[j];
            }
            if (sum + C > 0) ans++;
        }
        out.println(ans);
        
        out.flush();
    }
}