import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    private void run() {
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] r = new int[n];
        int[] g = new int[n];
        int[] b = new int[n];

        int numR = 0;
        int numG = 0;
        int numB = 0;
        for (int i = 0; i < n; i++) {
            switch (s[i]) {
                case 'R':
                    numR++;
                    break;
                case 'G':
                    numG++;
                    break;
                case 'B':
                    numB++;
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            switch (s[i]) {
                case 'R':
                    numR--;
                    break;
                case 'G':
                    numG--;
                    break;
                case 'B':
                    numB--;
                    break;
            }
            r[i] = numR;
            g[i] = numG;
            b[i] = numB;
        }

        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (s[i] == 'R' && s[j] == 'G' || s[j] == 'R' && s[i] == 'G') {
                    ans += b[j];
                    if (j + j - i < n && s[j + j - i] == 'B') ans--;
                }
                if (s[i] == 'G' && s[j] == 'B' || s[j] == 'G' && s[i] == 'B') {
                    ans += r[j];
                    if (j + j - i < n && s[j + j - i] == 'R') ans--;
                }
                if (s[i] == 'R' && s[j] == 'B' || s[j] == 'R' && s[i] == 'B') {
                    ans += g[j];
                    if (j + j - i < n && s[j + j - i] == 'G') ans--;
                }
            }
        }
        System.out.println(ans);
    }
}
