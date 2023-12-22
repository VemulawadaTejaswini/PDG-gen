
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        double EPS = 1e-8;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double da = Math.sqrt((double)a);
        if(da * da != (double)a)
            da += EPS;

        double db = Math.sqrt((double)b);
        if(db * db != (double)b)
            db += EPS;

        double dc = Math.sqrt((double)c);
        if(dc * dc != (double)c)
            dc += EPS;

        if(da + db < dc) {
            os.println("Yes");
        } else {
            os.println("No");
        }
    }
}