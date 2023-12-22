import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);
        int mx = -1;
        int mx2 = -1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                i++;
                mx2 = mx;
                mx = a[i];
            }
        }

        if (mx2 == -1) {
            System.out.println(0);
        } else {
            long area = mx;
            area *= mx2;
            System.out.println(area);
        }
    }
}