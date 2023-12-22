import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int query = sc.nextInt();

        int data[][] = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            data[sc.nextInt()][sc.nextInt()]++;
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                data[i][j] += data[i][j - 1];
            }
        }
        for (int j = 0; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                data[i][j] += data[i - 1][j];
            }
        }

        for (int i = 0; i < query; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println(data[q][q] - data[p - 1][q]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
