import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);

        int ans = 0;
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (a[i-1] == a[i]) {
                cnt++;
            } else {
                if (cnt % 2 == 1)
                    ans++;
                cnt = 1;
            }
        }

        System.out.println(ans);
    }
}
