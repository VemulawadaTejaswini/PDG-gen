import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    static void solve(Scanner in) {
        int N = in.nextInt();
        int[] L = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            L[i] = in.nextInt();
        }

        Arrays.sort(L);
        int sum = 0;
        for (int i = 0; i < 2 * N - 1; i += 2) {
            sum += L[i];
        }
        System.out.println(sum);
    }
}