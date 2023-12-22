
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        boolean isYes = true;
        for (int i = 0; i < n; i++) {
            if ((i % 2 == 0 && s.charAt(i) == 'L') || (i % 2 == 1 && s.charAt(i) == 'R')) {
                isYes = false;
                break;
            }
        }
        System.out.println(isYes ? "Yes": "No");
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
