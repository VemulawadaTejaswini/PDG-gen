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
        int d[] = new int[N];
        for(int i = 0; i < N; i++) {
            d[i] = scan.nextInt();
        }
        long answer = 0;
        for(int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                answer += d[i] * d[j];
            }
        }

        os.println(answer);

    }
}