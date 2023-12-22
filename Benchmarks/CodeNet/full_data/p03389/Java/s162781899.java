import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        Arrays.sort(a);

        if (a[0] == a[1] && a[1] == a[2]) {
            System.out.println(0);
            return;
        }

        int ans = 0;
        int d1 = a[2] - a[0];
        int d2 = a[2] - a[1];
        ans += d1 / 2 + d2 / 2;

        if (d1 % 2 == 0) {
            if (d2 % 2 == 0) {

            } else {
                ans += 2;
            }
        } else {
            if (d2 % 2 == 0) {
                ans += 2;
            } else {
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}