import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**

 *
 * @author Abhijeetkns
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ADoubleHelix solver = new ADoubleHelix();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADoubleHelix {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            String s = in.next();
            if (s.compareTo("A") == 0)
                out.println("T");
            else if (s.compareTo("T") == 0)
                out.println("A");
            else if (s.compareTo("G") == 0)
                out.println("C");
            else out.println("G");

        }

    }
}

