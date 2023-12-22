import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int max = 0;
        int cnt = 0;
        for (int i = 1; i < k*2; i *= 2) {
            max = i;
            cnt++;
        }

        int[] num1 = new int[n];
        num1[0] = max;
        for (int i = 1; i < n; i++) {
            if (i > cnt-1) {
                num1[i] = 1;
                continue;
            }
            num1[i] = num1[i-1] / 2;
        }

        double num2 = 1.0 / n;
        double ans = 0;
        for (int i : num1) {
            ans += num2 * 1.0 / i;
        }

        System.out.println(ans);
    }
}