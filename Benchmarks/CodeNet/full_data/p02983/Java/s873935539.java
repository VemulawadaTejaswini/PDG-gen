import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 10:34-

            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = 2019;

            if (l == 0 || r / x - (l - 1) / x > 0) {
                out.println(0);
            } else {
                int min = Integer.MAX_VALUE;
                for (int i = l; i < r + 1; i++) {
                    for (int j = i + 1; j < r + 1; j++) {
                        min = Math.min(min, (i * j) % x);
                    }
                }
                out.println(min);
            }
        }
    }

}
