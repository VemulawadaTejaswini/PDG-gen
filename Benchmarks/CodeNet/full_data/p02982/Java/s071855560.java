import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        double[][] x = new double[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextDouble();
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int i2 = i+1; i2 < n; i2++) {
                double tmp = 0.0;
                for (int j = 0; j < d; j++) {
                    tmp += (x[i][j] - x[i2][j]) * (x[i][j] - x[i2][j]);
                }
                double sq = Math.sqrt(tmp);
                if(sq == (int)sq) ans++;
            }
        }

        System.out.println(ans);
        sc.close();

    }

}
