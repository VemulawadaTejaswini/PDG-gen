import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int counteven = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] % 2 == 0) {
                counteven++;
            }
        }

        int ans = 0;
        if (counteven == 0 || counteven == 3) {
            ans += (a[2] - a[0]) / 2;
            ans += (a[2] - a[1]) / 2;
        } else if (counteven == 1) {
            if (a[2] % 2 == 0) {
                ans += (a[1] - a[0]) / 2;
                ans += a[2] - a[1];
            } else if (a[1] % 2 == 0) {
                ans += (a[2] + 1 - a[1]) / 2;
                ans += (a[2] - a[0]) / 2;
                ans += 1;
            } else if (a[0] % 2 == 0) {
                ans += (a[2] + 1 - a[0]) / 2;
                ans += (a[2] - a[1]) / 2;
                ans += 1;
            }
        } else if (counteven == 2) {
            if (a[2] % 2 == 1) {
                ans += (a[1] - a[0]) / 2;
                ans += a[2] - a[1];
            } else if (a[1] % 2 == 1) {
                ans += (a[2] + 1 - a[1]) / 2;
                ans += (a[2] - a[0]) / 2;
                ans += 1;
            } else if (a[0] % 2 == 1) {
                ans += (a[2] + 1 - a[0]) / 2;
                ans += (a[2] - a[1]) / 2;
                ans += 1;

            }
        }
        System.out.println(ans);
    }
}