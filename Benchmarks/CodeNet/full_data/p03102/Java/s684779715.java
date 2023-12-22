
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] b = new int[M];
        for (int j = 0; j < M; j++) {
            b[j] = sc.nextInt();
        }

        int[][] a = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int tmp = 0;
            for (int j = 0; j < M; j++) {
                tmp += a[i][j]*b[j];
            }
            tmp += C;
            if(tmp > 0){
                ans++;
            }
        }

        out.println(ans);
    }
}
