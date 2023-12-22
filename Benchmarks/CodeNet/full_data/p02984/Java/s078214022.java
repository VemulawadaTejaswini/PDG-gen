import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = 2 * sc.nextLong();
        }
        long offset = 0;
        for (int i = 0; i < n; i++) {
            offset = a[i] - offset;
        }
        long x0 = offset / 2;

        long cur = x0;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < n; i++) {
            sj.add(String.valueOf(cur));
            cur = a[i] - cur;
        }
        System.out.println(sj.toString());
    }

}
