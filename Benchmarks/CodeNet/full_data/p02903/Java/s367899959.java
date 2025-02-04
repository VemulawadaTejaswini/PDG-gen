import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long H;
        H = sc.nextLong();
        long W;
        W = sc.nextLong();
        long A;
        A = sc.nextLong();
        long B;
        B = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(H, W, A, B);
    }
}

class Solver {
    public void solve(long H, long W, long A, long B) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (j <= A && i <= B) {
                    stringBuffer.append(0);
                }
                else if (j > A && i <= B) {
                    stringBuffer.append(1);
                }
                else if (j <= A && i > B) {
                    stringBuffer.append(1);
                }
                else {
                    stringBuffer.append(0);
                }
            }
            stringBuffer.append("\n");
        }
        System.out.println(stringBuffer.toString());
    }
}

