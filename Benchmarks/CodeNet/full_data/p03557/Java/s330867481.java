import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextLong();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int count = 0;
        for (int j = 0; j < n; j++) {
            long bj = b[j];
            int aiCount = 0;
            int ckCount = 0;
            for (int i = 0; i < n; i++) {
                long ai = a[i];
                if (ai < bj) {
                    aiCount++;
                }
            }
            for (int k = 0; k < n; k++) {
                long ck = c[k];
                if (bj < ck) {
                    ckCount++;
                }
            }
            count += aiCount * ckCount;
        }
        System.out.println(count);
    }

}
