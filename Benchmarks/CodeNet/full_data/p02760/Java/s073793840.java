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
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        int N = scan.nextInt();
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = scan.nextInt();
        }
        boolean[][] done = new boolean[3][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (A[j][k] == b[i]) {
                        done[j][k] = true;
                    }
                }
            }
        }
        boolean bingo = false;
        for (int i = 0; i < 3; i++) {
            if (done[i][0] && done[i][1] && done[i][2]) {
                bingo = true;
            }
            if (done[0][i] && done[1][i] && done[2][i]) {
                bingo = true;
            }
        }
        if (done[0][0] && done[1][1] && done[2][2]) {
            bingo = true;
        }
        if (done[2][0] && done[1][1] && done[0][2]) {
            bingo = true;
        }
        System.out.println(bingo ? "Yes" : "No");
    }
}
