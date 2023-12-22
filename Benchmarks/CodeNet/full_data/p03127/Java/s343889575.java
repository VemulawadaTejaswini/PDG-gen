import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a[] = new long[100000];
        long min = 1000000000;

        for (int i = 0; i < n; i++) {
            long ai = sc.nextInt();
            a[i] = ai;
            if (ai < min) min = ai;
        }

        long count = 0;
        for (;count != n;) {
            count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 0 || a[i] == min) {
                    count++;
                    continue;
                }

                a[i] = a[i] % min;
                if (a[i] < min && a[i] > 0) min = a[i];
            }
        }

        System.out.println(min);
    }
}
