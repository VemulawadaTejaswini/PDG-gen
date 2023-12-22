import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 12:39-

            int n = sc.nextInt();
            int cnt = 0;
            for (int i = 1; i <= n; i++) {
                cnt += String.valueOf(i).length() % 2;
            }

            out.println(cnt);

        }
    }

}
