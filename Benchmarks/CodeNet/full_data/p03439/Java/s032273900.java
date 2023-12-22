
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve(System.in, System.out);
    }

    /*
    F V M F M
    F V F M F M
     */
    public static void solve(InputStream is, PrintStream os) {
        try (Scanner sc = new Scanner(is)) {
            int n = sc.nextInt();
            String[] seat = new String[n];
            seat[0] = read(0, sc, os);
            seat[n - 1] = read(n - 1, sc, os);
            if ("Vacant".equals(seat[0]))
                return;
            int left = -1;
            int right = n;
            while (right - left > 1) {
                int mid = left + (right - left) / 2;
                seat[mid] = read(mid, sc, os);
                if ("Vacant".equals(seat[mid]))
                    return;
                if (isOk(seat, left, mid, right))
                    right = mid;
                else
                    left = mid;
            }

        }
    }

    private static boolean isOk(String[] seat, int left, int mid, int right) {
        if (seat[left].equals(seat[mid]))
            return (mid - left) % 2 == 1;
        if (!seat[left].equals(seat[mid]))
            return (mid - left) % 2 == 0;
        return true;
    }

    private static String read(int n, Scanner sc, PrintStream os) {
        os.println(n);
        os.flush();
        String line = sc.next();
        return line;
    }
}
