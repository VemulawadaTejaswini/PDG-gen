import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.IntStream;

public class Main {
    public void solve(BufferedReader stdin, PrintWriter stdout) throws NumberFormatException, IOException {
        String s = stdin.readLine();
        long k = Long.parseLong(stdin.readLine());

        if (IntStream.range(0, s.length()).allMatch(i -> s.charAt(0) == s.charAt(i))) {
            stdout.println(s.length() * k / 2);
            return ;
        }

        char[] t = s.toCharArray();
        long c = 0;
        for (int i = 1; i < t.length; i++) {
            if (t[i - 1] == t[i]) {
                t[i] = '@';
                c++;
            }
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (t[t.length - 1] == '@') {
                stdout.println(c * k);
            } else {
                stdout.println((c + 1) * k - 1);
            }
        } else {
            stdout.println(c * k);
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }
}