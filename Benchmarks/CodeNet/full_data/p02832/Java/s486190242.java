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
        int N = scan.nextInt();
        int a[] = new int[N];

        for(int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }

        int ans = 0;
        int nextK = 1;
        for(int i = 0; i < N; i++) {
            if(a[i] != nextK)
                ans++;
            else
                nextK++;
        }

        if(ans == N)
            os.println("-1");
        else
            os.println(ans);
    }
}