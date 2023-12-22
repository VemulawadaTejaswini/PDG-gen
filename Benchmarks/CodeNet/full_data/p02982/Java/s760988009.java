import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] x = new int[n][d];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = 0;
                for (int k = 0; k < d; k++) {
                    tmp += pow(x[i][k] - x[j][k], 2);
                }
                double sroot = sqrt(tmp);
                if (sroot == (int) sroot) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}