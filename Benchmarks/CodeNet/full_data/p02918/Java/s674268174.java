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
        int K = scan.nextInt();
        String S = scan.next();
        char sArray[] = S.toCharArray();

        int red = 0, blue = 0;//red = RL, blue = LR
        char prev = sArray[0];
        int answer = 0;

        for (int i = 1; i < N; i++) {
            if(prev == 'L' && sArray[i] == 'R') {
                prev = 'R';
                blue++;
            } else if (prev == 'R' && sArray[i] == 'L') {
                prev = 'L';
                red++;
            } else if (prev == 'L' && sArray[i] == 'L') {
                answer++;
            } else if (prev == 'R' && sArray[i] == 'R') {
                answer++;
            }
        }
        int less = red > blue ? blue : red;
        int more = red < blue ? blue : red;

        if(K <= less) {
            answer += 2*K;
        } else {
            answer += 2*less + more - less;
        }
        os.println(answer);
    }
}