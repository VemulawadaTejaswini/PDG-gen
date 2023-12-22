
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
        String stations = scan.next();
        if(stations.charAt(0) == 'A' && stations.charAt(1) == 'A' && stations.charAt(2) == 'A') {
            os.println("No");
        } else if(stations.charAt(0) == 'B' && stations.charAt(1) == 'B' && stations.charAt(2) == 'B') {
            os.println("No");
        } else {
            os.println("Yes");
        }
    }
}