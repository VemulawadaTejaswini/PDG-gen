import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        long [] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextLong();
        }
        long count = 0L;
        long[] summaries = new long[n];
        long s = 0;
        for (int i = 0; i < n; i++) {
            s += a[i];
            summaries[i] = s;
            if (s == 0) count++;
        }
        for (int i = 0; i < n - 1; i++) {
            final long si = summaries[i];
            count += Arrays.stream(summaries, i + 1, n)
                    .filter(x -> x == si)
                    .count();
        }
        System.out.println(count);
    }
}
