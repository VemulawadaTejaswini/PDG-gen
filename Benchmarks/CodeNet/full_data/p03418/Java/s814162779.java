
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        /*
        for (int a = k; a <= n; a++) {
//            for (int a = 1; a <= n; a++) {
            for (int b = k; b <= n; b++) {
//                for (int b = 1; b <= n; b++) {
                if (a % b >= k) {
                    ans++;
                }
            }
        }
        */

        for (int b = 1; b <= n; b++) {
            int p = n / b;
            int r = n - p * b;
            ans += p * Math.max(0, b - k);
            ans += Math.max(0, r -k + 1);
        }

        System.out.println(ans);
        sc.close();
    }

}
