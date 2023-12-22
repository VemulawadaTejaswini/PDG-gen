import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        String s = scanner.next();
        Zalgolithm z = new Zalgolithm();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i);
            z.calcZarray(sub);
            for (int n: z.zArr) {
                max = Math.max(max, n);
            }
        }
        System.out.println(max);
    }
}


// Tested on AOJ
class Zalgolithm {
    public int[] zArr;

    void calcZarray(String s) {
        int n = s.length();
        zArr = new int[n];

        // range of z-box
        int l = 0, r = 0;
        for (int i = 1; i < n; ++i) {
            if (i > r) {
                l = r = i;
                while (r < n && s.charAt(r - l) == s.charAt(r)) {
                    r++;
                }
                zArr[i] = r - l;
                r--;
            } else {
                int k = i - l;
                if (zArr[k] < r - i + 1)
                    zArr[i] = zArr[k];
                else {
                    l = i;
                    while (r < n && s.charAt(r - l) == s.charAt(r)) {
                        r++;
                    }
                    zArr[i] = r - l;
                    r--;
                }
            }
        }
    }

}
