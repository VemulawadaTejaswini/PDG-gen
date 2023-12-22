import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        if (k == 0) {
            System.out.println(n * n);
            return;
        }

        int res = 0;
        for (int b = 1; b <= n; b++) {
            if (b >= k) {
                int i = (b - k) * (n / b);
                int j = Math.max(0, (n % b) - k + 1);

                res += i + j;
            }
        }
        System.out.println(res);
    }
}
