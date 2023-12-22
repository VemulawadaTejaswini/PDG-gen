import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] x = new long[n];
        long[] xx = new long[n];
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            x[i] = temp;
            xx[i] = temp;
        }
        Arrays.sort(xx);
        long l1 = xx[n / 2];
        long l2 = xx[n / 2 - 1];
        StringBuilder sb = new StringBuilder();
        if (l1 == l2) {
            for (int i = 0; i < n; i++) {
                sb.append(l1);
                sb.append("\n");
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (x[i] <= l2) {
                    sb.append(l1);
                } else {
                    sb.append(l2);
                }
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}