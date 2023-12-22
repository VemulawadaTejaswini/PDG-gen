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
        int h[] = new int[N];
        for (int i = 0; i < N ; i++) {
            h[i] = scan.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < N ; i++) {
            if(h[i] >= K)
                answer++;

        }

        os.println(answer);

    }
}