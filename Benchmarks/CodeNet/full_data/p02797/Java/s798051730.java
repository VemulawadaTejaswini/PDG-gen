import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long s = sc.nextLong();
        long[] a = new long[n];
        Arrays.fill(a, s + 1);
        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            if (cnt >= k) {
                break;
            }
            if (i == 0) {
                a[i++] = s / 2;
            }
            a[i] = s - a[i - 1];
        }

        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < n; i++) {
            sj.add(String.valueOf(a[i]));
        }
        System.out.println(sj.toString());
    }

}
