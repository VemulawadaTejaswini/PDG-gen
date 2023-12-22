import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2017/10/20 7:19.
 */
public class Main {
    static int N;

    static boolean isReachable(boolean used[], boolean[][] t, int pos, int cutFrom, int cutTo) {
        if (pos == cutTo) {
            return true;
        }
        used[pos] = true;
        for (int i = 0; i < N; i++) {
            if (!used[i] && t[pos][i] && !(pos == cutFrom && i == cutTo) && isReachable(used, t, i, cutFrom, cutTo)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            N = sc.nextInt();
            int M = sc.nextInt();
            boolean[][] t = new boolean[N][N];
            for (int i = 0; i < M; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;
                t[a][b] = t[b][a] = true;
            }
            int ans = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (!t[i][j]) {
                        continue;
                    }
                    boolean used[] = new boolean[N];
                    if (!isReachable(used, t, i, i, j)) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
