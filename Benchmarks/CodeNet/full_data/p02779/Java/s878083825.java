import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++)
            A[i] = scan.nextInt();

        Arrays.sort(A);
        for(int i = 1; i < N; i++){
            if(A[i-1] == A[i]) {
                os.println("NO");
                return;
            }
        }
        os.println("YES");
    }
}