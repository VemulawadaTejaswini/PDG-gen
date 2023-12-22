import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ab = new int[m][2];
        boolean flag = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                ab[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            int tmp = ab[i][0];
            if (tmp == 1) {
                int b = ab[i][1];
                for (int j = 0; j < m; j++) {
                    int a = ab[j][0];
                    if (b == a) {
                        if (ab[j][1] == n) {
                            flag = true;
                        }
                    }
                }
            }
        }

        System.out.println(flag ? "POSSIBLE" : "IMPOSSIBLE");

    }
}