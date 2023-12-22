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
        char sChar[] = S.toCharArray();

        long answer = 1;
        char prev = sChar[0];
        for(int i = 1; i < N ; i++) {
            if(prev != sChar[i]) {
                answer++;
                prev = sChar[i];
            }
        }

        os.println(answer);

    }
}