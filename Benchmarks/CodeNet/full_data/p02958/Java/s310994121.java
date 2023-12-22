import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (a[i-1] != i) {
                cnt++;
            }
        }

        if ((cnt == 2) || (cnt == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
