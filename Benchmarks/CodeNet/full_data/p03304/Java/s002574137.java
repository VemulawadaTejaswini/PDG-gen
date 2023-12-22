import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        double ans = 0.0;
        if (n < m) {
            ans = 1.000000;
        } else {
            if (d == 0) {
                ans = n / Math.pow(n, m);
            } else {
                int tmp = (n - d) * m;
                ans = tmp / Math.pow(n, m);
            }
        }

        System.out.printf("%.10f\n", ans);
    }
}