import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[][] B = new int[N][N];
        int[][] ans = new int[N][N];
        int Ans = N;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            ans[i][0] = B[i][0] = A[i];
        }
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < i + 1; j++) {
                ans[i][j] = ans[i - 1][j - 1] ^ A[i];
                B[i][j] = B[i - 1][j - 1] + A[i];
                if (ans[i][j] == B[i][j]) {
                    Ans++;
                }
            }
        }
        System.out.println(Ans);
    }
}