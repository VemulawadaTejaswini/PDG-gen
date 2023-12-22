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
        String S = scan.next();
        if (S.length() % 2 == 1) {
            os.println("No");
            return;
        }

        int secondStart = S.length()/2;
        String first = S.substring(0, secondStart);
        String second = S.substring(secondStart, S.length());

        if(first.equals(second)) {
            os.println("Yes");
        } else {
            os.println("No");
        }
    }
}