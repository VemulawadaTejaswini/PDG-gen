import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        boolean[][] D = new boolean[N][M]; //0=表, 0>裏
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                D[y][x] = !D[y][x];
                if (y > 0) {
                                   D[y - 1][x]     = !D[y - 1][x];
                    if (x > 0    ) D[y - 1][x - 1] = !D[y - 1][x - 1];
                    if (x < M - 1) D[y - 1][x + 1] = !D[y - 1][x + 1];
                }
                if (x > 0    ) D[y][x - 1] = !D[y][x - 1];
                if (x < M - 1) D[y][x + 1] = !D[y][x + 1];
                if (y < N - 1) {
                                   D[y + 1][x]     = !D[y + 1][x];
                    if (x > 0    ) D[y + 1][x - 1] = !D[y + 1][x - 1];
                    if (x < M - 1) D[y + 1][x + 1] = !D[y + 1][x + 1];
                }
            }
        }
        long ans = 0;
        for (int y = 0; y < N; y++)
            for (int x = 0; x < M; x++)
                if (D[y][x]) ans += 1;
        System.out.println(ans);
        sc.close();
    }
}
