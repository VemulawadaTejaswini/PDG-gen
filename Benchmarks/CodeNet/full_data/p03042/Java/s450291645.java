import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static long n;

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 12:16-

            String s = sc.next();
            boolean a = check(s.substring(0, 2));
            boolean b = check(s.substring(2));

            if (a && b) {
                out.println("AMBIGUOUS");
            } else if (!a && !b) {
                out.println("NA");
            } else if (a) {
                out.println("MMYY");
            } else {
                out.println("YYMM");
            }
        }
    }

    private static boolean check(String str) {
        int x = Integer.parseInt(str);
        return x > 0 && x <= 12;
    }
}
