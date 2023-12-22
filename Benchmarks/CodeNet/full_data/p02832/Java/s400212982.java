import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC148D - Brick Break

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (n == idx) break;
            for (int j = idx; j < n; j++) {
                idx++;
                if (a[j] == i + 1) {
                    break;
                } else {
                    ans++;
                }
            }
        }

        if (ans == n) ans = -1;

        System.out.println(ans);
    }
}
