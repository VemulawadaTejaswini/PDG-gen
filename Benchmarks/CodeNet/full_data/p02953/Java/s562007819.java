import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        Integer N = scan.nextInt();
        long H[] = new long[N];
        for(int i = 0; i < N; i++) {
            H[i] = scan.nextInt();
        }
        for (int i = N - 1 ; 0 < i ; i--) {
            if(H[i-1] <= H[i])
                continue;
            else if(H[i-1] - 1 == H[i])
                H[i-1] = H[i-1] - 1;
            else {
                os.println("No");
                return;
            }
        }

        os.println("Yes");
    }
}