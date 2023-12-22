import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long a[] = new long[n];
        long b[] = new long[n];
        long totala = 0, totalb = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
            totala += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextLong();
            totalb += b[i];
        }

        if (totala < totalb) {
            System.out.println(-1);
            return;
        }

        long d[] = new long[n];
        for (int i = 0; i < n; i++) {
            d[i] = a[i] - b[i];
        }

        Arrays.sort(d);

        int i = 0;
        int lack = 0;
        while (d[i] < 0) {
            lack += d[i];
            i++;
        }

        int j = n - 1;
        while (lack < 0) {
            lack += d[j];
            j--;
        }

        System.out.println(i + (n - 1 - j));
    }
}