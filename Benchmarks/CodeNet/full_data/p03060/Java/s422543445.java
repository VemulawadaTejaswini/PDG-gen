import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    // 11:07-
    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            int N = sc.nextInt();
            int[] vs = new int[N];
            int[] cs = new int[N];
            for (int i = 0; i < N; i++) vs[i] = sc.nextInt();
            for (int i = 0; i < N; i++) cs[i] = sc.nextInt();

            long ret = 0L;
            for (int i = 0; i < vs.length; i++) {
                int delta = vs[i] - cs[i];
                if (delta > 0) ret += delta;
            }

            out.println(ret);
        }
    }

}
