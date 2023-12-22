import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 12:26-

            int n = sc.nextInt();
            int[] as = new int[n + 1];
            int[] vs = new int[n + 1];
            for (int i = 1; i < as.length; i++) as[i] = sc.nextInt();

            for (int i = n; i > 0; i--) {
                int sum = 0;
                for (int j = 1; j * i < as.length; j+=2) {
                    sum += vs[j * i];
                }
                if (2 * i < vs.length) sum += as[2 * i];
                vs[i] = (sum % 2) ^ as[i];
            }

            List<Integer> balls = new ArrayList<>();
            for (int i = 1; i < vs.length; i++) {
                if (vs[i] > 0) balls.add(i);
            }

            out.println(balls.size());
            for (Integer ball : balls) {
                out.println(ball);
            }

        }
    }

}
