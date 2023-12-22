
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());

        long[] a = new long[m];
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        long sum = 0;
        for (int i = 0; i < m; i++) {
            sum += a[i];
        }

        if (n >= sum) {
            System.out.println(n - sum);
        } else {
            System.out.println(-1);
        }

    }

}
