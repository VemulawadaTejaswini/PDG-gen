import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 12:11-

            int n = sc.nextInt();
            int[] vs = new int[n];
            for (int i = 0; i < vs.length; i++) vs[i] = sc.nextInt();

            int[] ml = new int[n];
            ml[0] = vs[0];
            for (int i = 1; i < ml.length; i++) {
                ml[i] = Math.max(ml[i - 1], vs[i]);
            }

            int[] mr = new int[n];
            mr[n - 1] = vs[n - 1];
            for (int i = mr.length - 2; i >= 0; i--) {
                mr[i] = Math.max(mr[i + 1], vs[i]);
            }

            for (int i = 0; i < vs.length; i++) {
                if (i == 0) {
                    out.println(mr[i + 1]);
                } else if (i == n - 1) {
                    out.println(ml[i - 1]);
                } else {
                    out.println(Math.max(ml[i - 1], mr[i + 1]));
                }
            }

        }
    }
}
