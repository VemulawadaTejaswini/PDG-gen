
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int[] as = new int[n * 2 + 1];
        int prev = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - '0';
            if (i == 0) {
                prev = c;
                if (c == 0) {
                    j++;
                }
                as[j]++;
            } else {
                if (prev == c) {
                    as[j]++;
                } else {
                    j++;
                    prev = c;
                    as[j] = 1;
                }
            }
        }
        if (prev == 1) j++;
        //debug(as, j);
        int ans = 0;
        for (int i = 0; i < j; i += 2) {
            ans = Math.max(ans, as[i]);
            int r = k * 2 + 1;
            int sum = 0;
            for (int ii = i; ii <= i + 2 * k && ii < j; ii++) {
                sum += as[ii];
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
