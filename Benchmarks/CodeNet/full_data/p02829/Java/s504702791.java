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
        int a = scan.nextInt();
        int b = scan.nextInt();

        HashSet<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(a);
        set.remove(b);
        Integer ans = set.iterator().next();
        os.println(ans);
    }
}