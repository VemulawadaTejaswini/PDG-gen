
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            n -= in.nextInt();
        }
        if (n < 0) {
            out.println(-1);
        } else {
            out.println(n);
        }
        out.close();
    }
}
