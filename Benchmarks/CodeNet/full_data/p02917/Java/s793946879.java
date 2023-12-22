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
        int B[] = new int[N-1];
        for(int i = 0; i < N-1 ; i++) {
            B[i] = scan.nextInt();
        }
        int answer = 0;
        if(N == 2) {
            answer += B[0] + B[0];
        }
        for(int i = 1; i < N-1 ; i++) {
            if(B[i] > B[i-1]) {
                answer += B[i-1];
            } else {
                answer += B[i];
            }
            if(i == 1)
                answer += B[i-1];
            if(i == N-2) {
                answer += B[i];
            }
        }
        os.println(answer);
    }
}