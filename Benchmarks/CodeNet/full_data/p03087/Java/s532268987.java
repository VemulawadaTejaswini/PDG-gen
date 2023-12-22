import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static long n;

    // 15:41-
    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            int n = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();

            int[] cnts = new int[s.length()];
            for (int i = 1; i < s.length(); i++) {
                cnts[i] = cnts[i - 1];
                if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') cnts[i]++;
            }

            for (int i = 0; i < q; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;

                int ret = cnts[b] - (a == 0 ? 0 : cnts[a - 1]);
                if (a > 0 && s.charAt(a - 1) == 'A' && s.charAt(a) == 'C') ret--;

                out.println(ret);
            }
        }
    }
}
