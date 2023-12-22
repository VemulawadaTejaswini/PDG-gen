
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] a = new long[n + 1];
        for (int i = 1; i <= n; ++i) {
            a[i] = scanner.nextLong();
        }
        long[] value = new long[n + 1];
        int[] symbol = new int[n + 1];
        symbol[1] = 1;
        for (int i = 2; i <= n; ++i) {
            value[i] = a[i - 1] - value[i - 1];
            symbol[i] = -1 * symbol[i - 1];
         //   System.out.println("value[" + i + "]: " + value[i] + " sym: " + symbol[i]);
        }
        long[] ans = new long[n + 1];
        ans[1] = (a[n] - value[n]) / (symbol[n] + 1);
        for (int i = 2; i <= n; ++i) {
            ans[i] = value[i] + symbol[i] * ans[1];
        }
        for (int i = 1; i <= n; ++i) {
            System.out.print(2 * ans[i] + " ");
        }
    }
}
