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
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] c = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                c[i][j] = scan.nextInt();
            }
        }
        int[] A = new int[10];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int x = scan.nextInt();
                if (x == -1) {
                    continue;
                }
                A[x] += 1;
            }
        }
        int[][] d = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                d[i][j] = c[i][j];
            }
        }
        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]);
                }
            }
        }
        long answer = 0;
        for (int i = 0; i < 10; i++) {
            answer += (long) d[i][1] * A[i];
        }
        System.out.println(answer);
    }
}
