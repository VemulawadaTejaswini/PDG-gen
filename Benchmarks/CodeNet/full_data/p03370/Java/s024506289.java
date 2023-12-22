import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int X = in.nextInt();
            int[] m = new int[N];
            for (int i = 0; i < N; i++) {
                m[i] = in.nextInt();
            }

            Arrays.sort(m);

            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += m[i];
            }

            X -= sum;

            System.out.println(N + X / m[0]);
        }
    }
}
