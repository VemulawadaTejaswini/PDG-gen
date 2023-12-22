import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class Main {
    public void solve(final BufferedReader stdin, final PrintWriter stdout) throws NumberFormatException, IOException {
        int k = Integer.parseInt(stdin.readLine());
        int[] a = Pattern.compile(" ").splitAsStream(stdin.readLine()).mapToInt(Integer::parseInt).toArray();

        int min = 2;
        int max = 2;
        for (int i = k - 1; i >= 0; i--) {
            min = ceilDiv(min, a[i]) * a[i];
            if (max < min) {
                stdout.println(-1);
                return ;
            }

            max = max / a[i] * a[i] + a[i] - 1;
        }

        stdout.printf("%d %d%n", min, max);

    }

    private int ceilDiv(int x, int y) {
        if (x % y == 0) {
            return x / y;
        } else {
            return x / y + 1;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }
}
