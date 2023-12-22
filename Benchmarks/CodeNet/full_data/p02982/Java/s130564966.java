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
        int D = scan.nextInt();
        int[][] x = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                x[i][j] = scan.nextInt();
            }
        }
        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int d = 0;
                for (int k = 0; k < D; k++) {
                    d += (x[i][k]-x[j][k]) * (x[i][k]-x[j][k]);
                }
                for (int l = 1; l * l <= d; l++) {
                    if (l * l == d) {
                        answer += 1;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
