import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());

        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }

        scan.close();

        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        int border = (sum + (4 * m) - 1) / (4 * m);

        Arrays.sort(a, Collections.reverseOrder());

        if (a[m - 1] >= border) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
