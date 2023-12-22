import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 15:38-

            int n = sc.nextInt();
            int max = 0;
            int cur = -1;
            int last = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int h = sc.nextInt();
                if (h <= last) {
                    cur++;
                    max = Math.max(max, cur);
                } else {
                    cur = 0;
                }
                last = h;
            }

            out.println(max);

        }
    }

}
