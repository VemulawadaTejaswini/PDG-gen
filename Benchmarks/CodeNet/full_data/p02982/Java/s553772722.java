import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
            if (i > 0) {
                for (int j = i-1; j >= 0; j--) {
                    if (isCheck(x[i], x[j]))
                        ans++;
                }
            }
        }

        System.out.println(ans);
    }

    static boolean isCheck(int[] x, int[] y) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            int tmp = x[i] - y[i];
            sum += tmp * tmp;
        }

        double len = Math.sqrt(sum);
        if (len - Math.floor(len) > 0)
            return false;
        else
            return true;
    }
}