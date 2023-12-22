import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int p = stdin.nextInt();

        int m = (int)Math.sqrt((double)p);
        int[] c = new int[m + 1];
        for (int i = 2; i <= m; i++) {
            while (p % i == 0) {
                c[i]++;
                p /= i;
            }
        }

        int ans = 1;
        for (int i = 0; i <= m; i++) {
            if (n <= c[i]) {
                ans *= i * (c[i] / n);
            }
        }
        System.out.println(ans);
    }
}