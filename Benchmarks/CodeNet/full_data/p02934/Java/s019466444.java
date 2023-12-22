import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int a[] = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }

        double deno = 0;

        for(int i = 0; i < N; i++) {
            deno += 1.0/a[i];
        }

        double answer = 1.0/deno;

        os.println(answer);
    }
}