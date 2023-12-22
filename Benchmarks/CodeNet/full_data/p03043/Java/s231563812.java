import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double ans = 0.0;
        double tmp1 = 1.0 / n;
        for (int i = 1; i <= n; i++) {
            int tmp2 = i;
            int j = 0;
            for (; ; j++) {
                if(tmp2 > k) {
                    break;
                }
                tmp2 *= 2;
            }

            ans += Math.pow(0.5, j) * tmp1;
        }
        System.out.println(ans);
    }
}