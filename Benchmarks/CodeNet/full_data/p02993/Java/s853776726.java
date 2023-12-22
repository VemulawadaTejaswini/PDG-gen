
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char before = ' ';
        String ans = "Good";
        for (char c : s.toCharArray()) {
            if (c == before) {
                ans = "Bad";
                break;
            }
            before = c;
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
