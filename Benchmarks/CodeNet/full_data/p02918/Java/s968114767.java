
import java.util.*;
import java.io.PrintWriter;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int count = 0;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == s.charAt(i)) count++;
        }

        int kireme = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                kireme++;
            }
        }

        System.out.println(count + Math.min(kireme, k * 2));
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
