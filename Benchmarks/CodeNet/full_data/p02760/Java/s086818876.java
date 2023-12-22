
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
        int A[][] = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        int N = scan.nextInt();
        boolean b[][] = new boolean[3][3];

        for(int i = 0; i < N; i++) {
            helper(A, b, scan.nextInt());
        }

        if((b[0][0] && b[0][1] && b[0][2]) || (b[0][0] && b[1][1] && b[2][2]) || (b[0][0] && b[1][0] && b[2][0])
            || (b[1][0] && b[1][1] && b[1][2]) || (b[2][0] && b[2][1] && b[2][2]) || (b[0][1] && b[1][1] && b[2][1])
            || (b[0][0] && b[0][1] && b[0][2]) || (b[0][2] && b[1][2] && b[2][2]) || (b[2][0] && b[1][1] && b[0][2])) {
            os.println("Yes");
        } else
            os.println("No");

    }

    static void helper(int A[][], boolean b[][], int tgt) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(A[i][j] == tgt) {
                    b[i][j] = true;
                    return;
                }
            }
        }
    }
}