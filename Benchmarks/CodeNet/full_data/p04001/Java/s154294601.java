
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int limit = s.length() - 1;
        long ans = 0;
        for (int bit = 0; bit < (1 << limit); bit++) {
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
                if ((bit & (1 << i)) != 0) {
                    sum += Long.parseLong(sb.toString());
                    sb.setLength(0);
                }
            }
            if (sb.length() != 0) {
                sum += Long.parseLong(sb.toString());
            }
            ans += sum;
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
