
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < 32; ++i) {
            int count = 0;
            for (int j = 0; j < n; ++j) {
                if (a[j] % 2 == 1) {
                    count++;
                }
                a[j] /= 2;
            }
            if (!(count == 0 || count == (n - count) * 2)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
