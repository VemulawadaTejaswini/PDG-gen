import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        double ans = 0.0;
        for (int j = 1; j <= n; j++) {
            double tmp = 1.0 / (double)n;
            int i = j;
            while(i < k) {
                i *= 2;
                tmp /= 2.0;
            }
            ans += tmp;
        }
        System.out.println(ans);
    }
}