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
        int K = scan.nextInt();
        int Q = scan.nextInt();
        int winTime[] = new int[N];
        Arrays.fill(winTime, 0);

        for(int i = 0; i < Q; i++) {
            int j = scan.nextInt();
            winTime[j-1]++;
        }

        for(int win : winTime) {
            if(K - (Q - win) > 0) {
                os.println("Yes");
            } else {
                os.println("No");
            }
        }

    }
}