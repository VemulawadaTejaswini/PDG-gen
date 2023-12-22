
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
        long N = scan.nextLong();
        long A = scan.nextLong();
        long B = scan.nextLong();
        if((B-A)%2 == 0){
            os.println((B-A)/2);
            return;
        }

        if((A-1) < (N-B)) {
            os.println(B-1);
        } else {
            os.println(N-A);
        }
    }
}