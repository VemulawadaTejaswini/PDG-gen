import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AStationAndBus solver = new AStationAndBus();
        solver.solve(1, in, out);
        out.close();
    }

    static class AStationAndBus {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            String s = sc.nextLine();
            int a = 0, b = 0;
            for (int i = 0; i < 3; i++) {
                if (s.charAt(i) == 'A')
                    a++;
                else
                    b++;
            }
            if (a == 3 || b == 3) {
                out.println("No");
            } else {
                out.println("Yes");
            }
        }

    }

    static class inputClass {
        BufferedReader br;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

