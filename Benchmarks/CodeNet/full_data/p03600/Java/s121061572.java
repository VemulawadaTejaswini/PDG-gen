import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2017/09/29 8:06.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        final int MAX_COST = 1000000001;

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int t[][] = new int[N][N];
            int backup[][] = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    t[i][j] = sc.nextInt();
                    backup[i][j] = t[i][j];
                }
            }

            for (int k = 0; k < N; k++) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (i == j) {
                            continue;
                        }
                        t[i][j] = Math.min(t[i][j], t[i][k] + t[k][j]);
                    }
                }
            }

            boolean exists = true;
            for (int i = 0; exists && i < N; i++) {
                for (int j = 0; exists && j < N; j++) {
                    if (t[i][j] != backup[i][j]) {
                        exists = false;
                        break;
                    }
                }
            }
            if (!exists) {
                System.out.println(-1);
                continue;
            }

            for (int k = 0; k < N; k++) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (i == j || j == k || i == k) {
                            continue;
                        }
                        if (t[i][j] == backup[i][k] + backup[k][j]) {
                            t[i][j] = MAX_COST;
                        }
                    }
                }
            }

            long ans = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (t[i][j] == MAX_COST) {
                        continue;
                    }
                    ans += t[i][j];
                }
            }
            System.out.println(ans);
        }
    }
}