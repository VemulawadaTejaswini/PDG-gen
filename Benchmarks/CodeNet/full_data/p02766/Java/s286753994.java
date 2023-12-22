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
        int K = scan.nextInt();

        int ans = 0;
        while(N >= K) {
            N /= K;
            ans++;
        }

        if(N != 0)
            ans++;

        os.println(ans);
    }
}