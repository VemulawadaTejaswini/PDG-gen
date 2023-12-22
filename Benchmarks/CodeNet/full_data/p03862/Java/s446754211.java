
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int count = 0;
        for (int i = 1; i < n; i++) {
            int sum = a[i] + a[i - 1];

            if (sum > x) {
                int t = sum - x;
                count += t;
                a[i] -= t;
            }
        }
        System.out.println(count);
    }
}