
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String lis[] = {
            "dream", "dreamer", "erase", "eraser"
        };
        while (true) {
            if (s.length() == 0) {
                System.out.println("YES");
                return;
            }
            boolean updated = false;
            for (int i = 0; i < 4; ++i) {
                String k = lis[i];
                if (s.length() >= k.length() && s.substring(s.length() - k.length(), s.length()).equals(k)) {
                    s = s.substring(0, s.length() - k.length());
                    updated = true;
                    break;
                } else {
                    continue;
                }
            }
            if (!updated) {
                System.out.println("NO");
                return;
            }
        }
    }
}
