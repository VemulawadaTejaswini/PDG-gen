
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
        String s = String.valueOf(N);

        if(s.charAt(0) == '7' || s.charAt(1) == '7' || s.charAt(2) == '7' )
            os.println("Yes");
        else
            os.println("No");
    }
}