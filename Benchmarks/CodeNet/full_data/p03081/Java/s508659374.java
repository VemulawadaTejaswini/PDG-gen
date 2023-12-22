
import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        String s = sc.next();
        char[] ts = new char[q];
        char[] ds = new char[q];

        for (int i = 0; i < q; i++) {
            ts[i] = sc.next().charAt(0);
            ds[i] = sc.next().charAt(0);
        }

        int maxL = 0, maxR = 0;

//        debug(s);
//        debug(ts);
//        debug(ds);

        int cntL = 0, cntR = 0;
        for (int i = q - 1; i >= 0; i--) {
            if (ds[i] == 'L' && s.charAt(cntL) == ts[i]) {
                cntL++;
            }
            if (ds[i] == 'R' && s.charAt(n - cntR - 1) == ts[i]) {
                cntR++;
            }
        }
        maxL = Math.max(maxL, cntL);
        maxR = Math.max(maxR, cntR);

        debug(maxL, maxR);
        System.out.println(n - (Math.min(n, maxL + maxR)));
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
