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
        int H[] = new int[N];

        for(int i = 0; i < N; i++) {
            H[i] = scan.nextInt();
        }

        int tmp = 0;
        int answer = 0;
        int prev = H[0];
        for(int i = 1; i < N; i++) {
            if(prev >= H[i]) {
                tmp++;
            } else {
                if(tmp > answer) {
                    answer = tmp;
                }
                tmp = 0;
            }

            prev = H[i];
        }
        if(tmp > answer) {
            answer = tmp;
        }

        os.println(answer);
    }
}