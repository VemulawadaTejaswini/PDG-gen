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
        int A[] = new int[N];
        for (int i = 0; i < N ; i++) {
            A[i] = scan.nextInt();
        }
        int B[] = new int[N];
        for (int i = 0; i < N ; i++) {
            B[A[i]-1] = i+1;
        }

        for (int i = 0; i < N - 1 ; i++) {
            os.print(B[i] + " ");
        }
        os.println(B[N-1]);

    }
}