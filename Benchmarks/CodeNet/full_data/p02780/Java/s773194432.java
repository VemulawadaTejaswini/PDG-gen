import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        double[] p = new double[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextDouble();
        }
        double ans = 0.0;

        for (int i = 0; i < n - k + 1; i++) {
            double sum = 0.0;
            for (int j = i; j < i + k; j++) {
                double tmp = (p[j] + 1.0) / 2.0;
                sum += tmp;
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
}