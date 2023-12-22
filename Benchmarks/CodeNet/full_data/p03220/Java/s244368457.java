import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        double[] tt = new double[n];
        for (int i = 0; i < n; i++) {
            tt[i] = t - h[i] * 0.006;
        }
        double min = 1000000;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            double sa = Math.abs(a - tt[i]);
            if (sa < min) {
                min = sa;
                ans = i;
            }
        }
        System.out.println(ans + 1);
    }
}