import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // long N = Long.parseLong(sc.next());
        String N = sc.next();
        int all9 = 0;
        for (int i = N.length() - 1; i > 0; i--) {
            if (N.charAt(i) != '9') {
                all9 = 1;
                break;
            }
        }

        int ans = 0;
        for (int i = 0; i < N.length(); i++) {
            if (i == 0) {
                ans += (Integer.parseInt(N.substring(0, 1)) - all9);
            } else {
                ans += 9;
            }
        }
        out.printf("%d\n", ans);
        out.flush();
    }
}
