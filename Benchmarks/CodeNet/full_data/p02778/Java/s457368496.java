import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(in, out);
        out.close();
    }

    static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            String S = in.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                sb.append("x");
            }
            out.println(sb.toString());
            // out.println("x".repeat(S.length()));
        }
    }
}