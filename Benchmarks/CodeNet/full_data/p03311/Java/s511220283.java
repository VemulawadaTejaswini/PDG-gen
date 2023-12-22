import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt() - i - 1;
        }
        Arrays.sort(as);
        long median = n % 2 == 1 ? as[n / 2] : Math.round((as[n / 2 - 1] + as[n / 2]) / 2);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(as[i] - median);
        }
        System.out.println(ans);
    }
}
