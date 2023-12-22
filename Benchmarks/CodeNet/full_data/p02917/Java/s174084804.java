import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n-1];

        for (int i = 0; i < n - 1; i++) {
            b[i] = in.nextInt();
        }

        a[n-1] = Integer.MAX_VALUE;
        for (int i = n-2; i >= 0; i--) {
            a[i+1] = Integer.min(a[i+1], b[i]);
            a[i] = b[i];
        }

        int out = 0;
        for (int i = 0; i < n; i++) {
            out += a[i];
        }

        System.out.println(out);
    }
}
