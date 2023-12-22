import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    public static void main(String[] args) {
        int N = nint();
        int M = nint();
        int K = nint();
        
        for (int r = 0; r <= N; r++) {
            for (int c = 0; c <= M; c++) {
                int numBlack = (N-r)*c + (M-c)*r;
                if (numBlack == K) {
                    so.println("Yes");
                    return;
                }
            }
        }
        so.println("No");
    }
    private static int nint() {
        return sc.nextInt();
    }
}
