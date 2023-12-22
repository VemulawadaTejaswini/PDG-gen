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
        String S = scan.next();
        char sArray[] = S.toCharArray();

        int i = 1;
        for (char s :sArray) {
            if(i % 2 == 1) {
                if(s == 'R' || s == 'U' || s == 'D') {
                    i++;
                    continue;
                } else {
                    os.println("No");
                    return;
                }
            } else {
                if(s == 'L' || s == 'U' || s == 'D') {
                    i++;
                    continue;
                } else {
                    os.println("No");
                    return;
                }
            }
        }
        os.println("Yes");

    }
}