
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
        long times = N / (A+B);
        long remain = N % (A+B);
        long remA = remain <= A ? remain : A;
        os.println(times*A +remA);
    }


}