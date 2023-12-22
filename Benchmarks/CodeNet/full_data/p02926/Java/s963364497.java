import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        double[][] v = new double[N][2];
        for (int i = 0; i < N; i++) {
            v[i][0] = scan.nextInt();
            v[i][1] = scan.nextInt();
        }
        double answer = 0;
        for (int i = 0; i < N; i++) {
            double target_x = v[i][0];
            double target_y = v[i][1];
            double current_x = target_x;
            double current_y = target_y;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                double next_x = v[j][0];
                double next_y = v[j][1];
                double target = target_x * next_x + target_y * next_y;
                if (target < 0) {
                    continue;
                }
                current_x += next_x;
                current_y += next_y;
            }
            answer = Math.max(answer, Math.sqrt(current_x * current_x + current_y * current_y));
        }
        System.out.printf("%.12f\n", answer);
    }
}
