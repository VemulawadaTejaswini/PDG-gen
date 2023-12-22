
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

        long ans = 0;
        for(int i = 1; i <= N; i++) {
            if(i % 3 == 0 || i % 5 == 0) continue;
            ans += i;
        }

        os.println(ans);
    }

}