import java.util.Scanner;

public class Main	 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < x.length; i++) {

            int[] row1;
            int[] row2;
            if (i + 1 >= x.length) {
                row1 = x[i];
                row2 = x[0];
            } else {
                row1 = x[i];
                row2 = x[i + 1];
            }

            double dist = 0;
            for (int j = 0; j < d; j++) {
                dist += calc(row1[j], row2[j]);
            }

            if (Math.sqrt(dist) % 1 == 0) {
                ans++;
            }
        }

        if (d == 1) {
            ans *= 2;
        }
        System.out.println(ans);
    }

    private static double calc(int i, int j) {
        return Math.pow(Math.abs(i - j), 2);
    }
}
