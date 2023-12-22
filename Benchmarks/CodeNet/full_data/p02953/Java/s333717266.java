import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int N = in.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = in.nextInt();
        }

        int step = 0;
        for (int i : H) {
            if (i < step) {
                out.println("No");
                return;
            } else if (i <= step + 1) {
                continue;
            } else {
                step = i - 1;
            }
        }
        out.println("Yes");
    }
}
