import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        long map[][] = new long[n][n];
        long minCost[][] = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
                minCost[i][j] = map[i][j];
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (map[i][j] != minCost[i][j]) {
                    System.out.println(-1);
                    System.exit(0);
                }

                boolean res = false;
                for (int k = 0; k < n; k++) {
                    if (i == k || j == k) {
                        continue;
                    }

                    if (map[i][j] == map[i][k] + map[k][j]) {
                        res = true;
                        break;
                    }
                }

                if (!res) {
                    sum += map[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
