
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean count[] = new boolean[100001];
        int N = in.nextInt();

        int prev = 0;
        int act = 0;
        for (int i = 0 ; i < N; i++) {
            int inp = in.nextInt();

            if (count[inp]) {
                if (prev == 0) {
                    prev = inp;
                } else {
                    act += 1;
                    prev = 0;
                }
            }

            count[inp] = true;
        }
        if (prev != 0) {
            act += 1;
        }

        out.print(N - act * 2);
    }
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;
}
