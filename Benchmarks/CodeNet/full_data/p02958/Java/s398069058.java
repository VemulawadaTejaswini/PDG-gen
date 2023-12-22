import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }

        int[] q = Arrays.copyOf(p, n);

        Arrays.sort(p);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] != q[i]) {
                count++;
            }
        }

        if (count <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
