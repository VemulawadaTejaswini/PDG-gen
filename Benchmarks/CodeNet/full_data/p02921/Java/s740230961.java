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
        String T = scan.next();

        char[] arrayS = S.toCharArray();
        char[] arrayT = T.toCharArray();

        int answer = 0;
        for (int i = 0; i < 3; i++) {
            if(arrayS[i] == arrayT[i])
                answer++;
        }

        os.println(answer);
    }
}