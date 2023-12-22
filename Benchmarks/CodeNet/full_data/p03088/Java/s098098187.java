
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        if (n == 3) {
            System.out.println(61);
            return;
        }
        int[] acc = new int[101];
        acc[0] = 1;
        acc[1] = 4;
        acc[2] = 16;
        acc[3] = 61;
        for (int i = 4; i <= n; i++) {
            acc[i] = acc[i - 1] * 4;
            acc[i] %= 1_000_000_007L;
            // ?AG|C
            acc[i] -= acc[i - 3];
            // ?GA|C
            acc[i] -= acc[i - 3];
            // A?G|C && ? != C
            acc[i] -= acc[i - 4] * 3;
            // ?AC|G && ? != G
            acc[i] -= acc[i - 4] * 3;
            acc[i] %= 1_000_000_007L;
        }
        System.out.println(acc[n]);
    }
}