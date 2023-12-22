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
            int N = in.nextInt();
            boolean approved = true;
            for (int i = 0; i < N; i++) {
                int A = in.nextInt();
                if (A % 2 == 0) {
                    if (!(A % 3 == 0 || A % 5 == 0)) {
                        approved = false;
                    }
                }
            }
            out.println(approved ? "APPROVED" : "DENIED");
        }
    }
}