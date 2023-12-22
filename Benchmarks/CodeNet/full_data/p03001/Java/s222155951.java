import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 12:37-

            int w = sc.nextInt();
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            out.println(w * h / 2.0 + " " + (x * 2 == w && y * 2 == h ? 1 : 0));
        }
    }
}
