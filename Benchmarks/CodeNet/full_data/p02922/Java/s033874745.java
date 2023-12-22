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
        int A = scan.nextInt();
        int B = scan.nextInt();

        int answer = 0;
        int prev = 1;
        int now = 1;
        while(now < B) {
            prev = now;
            now = prev - 1 + A;
            answer++;
        }

        os.println(answer);
    }
}