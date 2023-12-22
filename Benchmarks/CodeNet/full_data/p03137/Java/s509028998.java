import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] X = new int[M];
            for (int i = 0; i < M; i++) {
                X[i] = in.nextInt();
            }
            Arrays.sort(X);

            int[] diff = new int[M - 1];
            for (int i = 0; i < diff.length; i++) {
                diff[i] = X[i + 1] - X[i];
            }
            Arrays.sort(diff);

            int count = 0;
            for (int i = 0; i < diff.length - (N - 1); i++) {
                count += diff[i];
            }

            System.out.println(count);
        }
    }
}
