
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int as = 0, be = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = s.length() - 2; j > 0; j--) {
                if (s.charAt(j - 1) == 'A' && s.charAt(j) == 'B') ans++;
            }
            if (s.charAt(0) == 'B') as++;
            if (s.charAt(s.length() - 1) == 'A')be++;
        }
        debug(ans, as, be);
        System.out.println(ans + Math.min(as, be));
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
