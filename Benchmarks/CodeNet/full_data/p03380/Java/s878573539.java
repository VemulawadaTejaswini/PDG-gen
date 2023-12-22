import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int ans1 = a[n - 1];
        int ans2 = a[0];
        for (int i = 0; i < n - 1; i++) {
            if ((ans1 - ans2 * 2) > Math.abs(ans1 - a[i] * 2)) {
                ans2 = a[i];
            }
        }

        System.out.println(ans1 + " " + ans2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
