import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String suff[] = {"dream", "dreamer", "erase", "eraser"};

        while (s.length() > 0) {
            int n = s.length();
            for (int i = 0; i < suff.length; i++) {
                if (s.endsWith(suff[i])) {
                    s = new String(s.substring(0, n - suff[i].length()));
                    break;
                }
            }
            if (s.length() == n) {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}