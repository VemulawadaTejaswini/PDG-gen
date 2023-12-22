import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = scan.next().toCharArray();
        }
        long ans = 0;
        int A = 0;
        for (int B = 0; B < N; B++) {
            char[][] after = new char[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    after[i][j] = map[(i + A) % N][(j + B) % N];
                }
            }
            boolean ok = true;
            for (int i = 0; i < N && ok; i++) {
                for (int j = i + 1; j < N && ok; j++) {
                    if (after[i][j] != after[j][i]) {
                        ok = false;
                        break;
                    }
                }
            }
            if (ok) {
                ans += 1;
            }
        }
        System.out.println(ans * N);
    }
}
