import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int k = sc.nextInt();
        long a[] = new long[k];
        for (int i = 0; i < k; i++) {
            a[k - i - 1] = sc.nextInt();
        }

        if (a[0] != 2) {
            System.out.println(-1);
            return;
        }

        long min = 2;
        long max = 2;
        for (int i = 1; i < k; i++) {
            if (2 * min <= a[i]) {
                System.out.println(-1);
                return;
            }

            min = a[i] * ((min + a[i] - 1) / a[i]);
            max = a[i] * ((max + a[i - 1] - 1) / a[i]);
        }
        max += a[k - 1] - 1;

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
