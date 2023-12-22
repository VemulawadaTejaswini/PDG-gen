import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    //
    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            int n = sc.nextInt();
            int cnt = 1;
            int max = sc.nextInt();
            for (int i = 1; i < n; i++) {
                int cur = sc.nextInt();
                if (cur >= max) {
                    cnt++;
                    max = cur;
                }
            }

            out.println(cnt);
        }
    }
}
