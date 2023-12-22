import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int[] ans = new int[n + 1];
        for (int i = n; i >= 1; i--) {
            int sum = 0;
            for (int j = i; j <= n; j *= 2) {
                if (ans[j] == 1) {
                    sum++;
                }
            }
            if (sum % 2 == 0 && a[i] == 1
                || sum % 2 != 0 && a[i] == 0) {
                ans[i] = 1;
            }
        }

        List<String> ball = new ArrayList<>();
        for (int i = 1; i < ans.length; i++) {
            if (ans[i] == 1) {
                ball.add(String.valueOf(i));
            }
        }
        System.out.println(ball.size());
        System.out.println(String.join(" ", ball));
    }

}
