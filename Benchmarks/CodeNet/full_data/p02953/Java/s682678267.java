import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 12:44-

            int n = sc.nextInt();
            int last = sc.nextInt() - 1;
            for (int i = 1; i < n; i++) {
                int cur = sc.nextInt();
                if (cur < last) {
                    out.println("No");
                    return;
                }
                if (cur > last) cur--;
                last = cur;
            }

            out.println("Yes");
        }
    }

}
